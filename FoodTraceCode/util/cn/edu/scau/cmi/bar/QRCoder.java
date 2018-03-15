package cn.edu.scau.cmi.bar;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.text.StyledEditorKit.FontFamilyAction;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
public class QRCoder {
	private static final String CHARSET = "utf-8";
	private static final String FORMAT_NAME = "JPG";
	// 二维码尺寸
	private static final int QRCODE_SIZE = 300;
	// LOGO宽度
	private static final int WIDTH = 60;
	// LOGO高度
	private static final int HEIGHT = 60;
	
//	核心方法，创建二维条码图片
	/**
	 * 
	 * @param content 条码内容
	 * @param logoImg 二维码logo
	 * @param isCompressLogoImg 
	 * @param memo 条码下面文字
	 * @return
	 * @throws Exception
	 */
	private static BufferedImage createQRImage(
			String content, File logoImg, boolean isCompressLogoImg, String memo) throws Exception {
		
		Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
		
		//设置纠错等级
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		//设置字符集
		hints.put(EncodeHintType.CHARACTER_SET, CHARSET);
		//设置外边距
		hints.put(EncodeHintType.MARGIN, 1);
//		二维条码的区域
//		获得编码后的位矩阵
		BitMatrix bitMatrix = new MultiFormatWriter().
				encode(content, BarcodeFormat.QR_CODE, QRCODE_SIZE, QRCODE_SIZE, hints);
		int width = bitMatrix.getWidth();
		int height = bitMatrix.getHeight();
		BufferedImage image;
		
//		image是二维条码的image大小
//		如果要添加底部文字，要把图片高度伸长一定百分比，以便写入字符串
		if(memo!=null) {
			image = appendMemoUnferQR(width,height, memo);
//			在条码的范围之外添加说明文字
			
		}else {
			image = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
		}
		
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000	: 0xFFFFFFFF);
			}
		}
//		如果有logoImg,就在生成的二维条码图片中添加logo图片
		if (logoImg != null){
			insertImageIntoQR(image, logoImg, isCompressLogoImg);
		}
		return image;
	}
	
	
//	在生成的二维条码下面插入备注信息
	private static BufferedImage appendMemoUnferQR(int width,int height,String memo) throws Exception {
		BufferedImage image = new BufferedImage(width, height*12/10,BufferedImage.TYPE_INT_RGB);
		int w = image.getWidth();
		int h = image.getHeight();
		float memoX = w/20;	
	    float memoY = w+(h-w)/2;
		for(int i=0;i<w;i++){
			for(int j=w; j<h;j++){
				image.setRGB(i, j, 0xFFFFFFFF);
			}
		}
		Graphics2D graphics2D = image.createGraphics();
		graphics2D.setColor(Color.black);
		graphics2D.setFont(new Font(null, Font.BOLD, 20));
		graphics2D.setBackground(Color.white);
		graphics2D.drawString(memo,  memoX,	 memoY);
		graphics2D.dispose();
		return image;
	}
	
	
//	在生成的二维条码中间插入图片
	private static void insertImageIntoQR(BufferedImage sourceBufferedImage, File logImgFile, boolean needCompress) throws Exception {
//		File file = new File(logImg);
		if (!logImgFile.exists()) {
			System.err.println(""+logImgFile+"   该文件不存在！");
			return;
		}
		Image src = ImageIO.read(logImgFile);
		int width = src.getWidth(null);
		int height = src.getHeight(null);
		if (needCompress) { // 压缩LOGO
			if (width > WIDTH) {
				width = WIDTH;
			}
			if (height > HEIGHT) {
				height = HEIGHT;
			}
			Image image = src.getScaledInstance(width, height,	Image.SCALE_SMOOTH);
			BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics g = tag.getGraphics();
			g.drawImage(image, 0, 0, null); // 绘制缩小后的图
			g.dispose();
			src = image;
		}
		// 插入LOGO
		Graphics2D graph = sourceBufferedImage.createGraphics();
		int x = (QRCODE_SIZE - width) / 2;
		int y = (QRCODE_SIZE - height) / 2;
		graph.drawImage(src, x, y, width, height, null);
		
		
		Shape shape = new RoundRectangle2D.Float(x, y, width, width, 6, 6);
		graph.draw(shape);
		graph.dispose();
	}


	public static void mkdirs(String destPath) {
		File file =new File(destPath);    
		//当文件夹不存在时，mkdirs会自动创建多层目录，区别于mkdir．(mkdir如果父目录不存在则会抛出异常)
		if (!file.exists() && !file.isDirectory()) {
			file.mkdirs();
		}
	}

//	利用内容、QR目录、文件、二维码中插入的目录、是否需要压缩创建二维码,design by 梁早清
	public static void encode(String qrContent, File logImgFile, boolean needCompress, String memo,File targetImageFile) throws Exception {
		BufferedImage qrImage = createQRImage(qrContent, logImgFile, needCompress, memo);
		ImageIO.write(qrImage, FORMAT_NAME, targetImageFile);
		
	}

}
