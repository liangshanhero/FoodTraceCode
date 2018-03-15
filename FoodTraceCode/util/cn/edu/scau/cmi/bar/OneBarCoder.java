package cn.edu.scau.cmi.bar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import org.jbarcode.JBarcode;
import org.jbarcode.encode.Code39Encoder;
import org.jbarcode.encode.EAN13Encoder;
import org.jbarcode.encode.EAN8Encoder;
import org.jbarcode.paint.BaseLineTextPainter;
import org.jbarcode.paint.EAN13TextPainter;
import org.jbarcode.paint.EAN8TextPainter;
import org.jbarcode.paint.WideRatioCodedPainter;
import org.jbarcode.paint.WidthCodedPainter;
import org.jbarcode.util.ImageUtil;

public class OneBarCoder {
//  几个测试的方法
	public static void oneBarCoder(String str, File directory, ImageFileTypeEnum imageType) {
		
		try {
			JBarcode localJBarcode = new JBarcode(EAN8Encoder.getInstance(), WidthCodedPainter.getInstance(),	EAN8TextPainter.getInstance());
			// 生成. 欧洲商品条码(=European Article Number)

			BufferedImage localBufferedImage = localJBarcode.createBarcode(str);
			File target=new File(directory.getAbsolutePath() + "\\"+str+"."+imageType.toString().toLowerCase());
			FileOutputStream localFileOutputStream = new FileOutputStream(target);
			ImageUtil.encodeAndWrite(localBufferedImage, imageType.toString().toLowerCase(), localFileOutputStream, 96, 96);
			localFileOutputStream.close();
			
			
			
			
			
//			saveToFile(localBufferedImage, new File("EAN8_"+str+".gif"),ImageTypeEnum.PNG);
			
//			localJBarcode.setEncoder(Code39Encoder.getInstance());
//			localJBarcode.setPainter(WideRatioCodedPainter.getInstance());
//			localJBarcode.setTextPainter(BaseLineTextPainter.getInstance());
//			localJBarcode.setShowCheckDigit(false);
//			
//			
//			localBufferedImage = localJBarcode.createBarcode(str);

		} catch (Exception localException) {
			localException.printStackTrace();
		}
	}

//	static void saveToJPEG(BufferedImage paramBufferedImage, String paramString) {
//		saveToFile(paramBufferedImage, paramString, "jpeg");
//	}
//
//	static void saveToPNG(BufferedImage paramBufferedImage, File paramString) {
//		saveToFile(paramBufferedImage, paramString, "png");
//	}
//
//	static void saveToGIF(BufferedImage paramBufferedImage, String paramString) {
//		saveToFile(paramBufferedImage, paramString, "gif");
//	}

//	static void saveToFile(BufferedImage paramBufferedImage, File imageFile, ImageTypeEnum fileType) {
//		try {
//			FileOutputStream localFileOutputStream = new FileOutputStream("d:/生成的测试条码/" + imageFile);
//			ImageUtil.encodeAndWrite(paramBufferedImage, fileType.toString().toLowerCase(), localFileOutputStream, 96, 96);
//			localFileOutputStream.close();
//		} catch (Exception localException) {
//			localException.printStackTrace();
//		}
//	}

}
