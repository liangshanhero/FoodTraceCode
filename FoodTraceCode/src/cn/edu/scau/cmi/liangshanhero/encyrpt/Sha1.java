package cn.edu.scau.cmi.liangshanhero.encyrpt;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha1 {

	public static void main(String[] args) {

		String str="abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc";
		DigestUtils.shaHex(str);
		System.out.print(DigestUtils.md5(str));
		DigestUtils.md5(str);
	}

}
