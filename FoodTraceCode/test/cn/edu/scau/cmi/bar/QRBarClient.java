package cn.edu.scau.cmi.bar;

import java.io.File;
import java.util.Random;

import cn.edu.scau.cmi.bar.QRCoder;
import cn.edu.scau.cmi.bar.QRDecoder;
import cn.edu.scau.cmi.liangshanhero.encyrpt.RSA_Encrypt;

public class QRBarClient {

	public static void main(String[] args) throws Exception {

		
		String qrContent ="pigHouse888180022332628";
		//加密
		String imageName = "保育3号";
//		String encryptQrContent=RSA_Encrypt.encrypt(qrContent);
		File targetFile=new File(imageName+".jpg");
		File logImgFile=null;
		QRCoder.encode(qrContent, logImgFile, false, imageName,targetFile);
		System.out.println("生成的二维条码不解密的值是："+QRDecoder.decode(targetFile));
//		System.out.println("生成的二维条码解密后的值是："+RSA_Encrypt.decrypt(QRDecoder.decode(targetFile)));

	}
 
}
