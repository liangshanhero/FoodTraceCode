package cn.edu.scau.cmi.bar;

import java.io.File;


public class OneBarClient {

	public static void main(String[] args) throws Exception {
		
		OneBarCoder.oneBarCoder("1234567", new File("d:/生成的测试条码/"),ImageFileTypeEnum.PNG);
		System.out.println("Hello");

	}

}
