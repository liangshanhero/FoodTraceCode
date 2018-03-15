package cn.edu.scau.cmi.liangshanhero.encyrpt;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;


public class RSAUtilsTest {

	public static void main(String[] args) throws Exception {  
        // TODO Auto-generated method stub  
        HashMap<String, Object> map = RSAUtils.getKeys();  
        //生成公钥和私钥  
        RSAPublicKey publicKey = (RSAPublicKey) map.get("public");  
        RSAPrivateKey privateKey = (RSAPrivateKey) map.get("private");  
          
        //模  
        String modulus = publicKey.getModulus().toString();  
        //公钥指数  
        String public_exponent = publicKey.getPublicExponent().toString();  
        //私钥指数  
        String private_exponent = privateKey.getPrivateExponent().toString();  
        //明文  
        String traceCode = "123456789123456789123456789123456789123456789123456789";  
        //使用模和指数生成公钥和私钥  
        RSAPublicKey pubKey = RSAUtils.getPublicKey(modulus, public_exponent);  
        RSAPrivateKey priKey = RSAUtils.getPrivateKey(modulus, private_exponent);  
        //加密后的密文  
        String mi = RSAUtils.encryptByPublicKey(traceCode, pubKey);  
        System.err.println("密文是："+mi);  
        //解密后的明文  
        traceCode = RSAUtils.decryptByPrivateKey(mi, priKey);  
        System.err.println("解密后的内容是："+traceCode);  
    }  

}
