public class StringReplace {

	public static void main(String[] args) {
		String str="javaScript and java";		//定义字符串
		str=str.replace("ja","Ja");		//替换字符串中的字符串ja为Ja
		System.out.println(str);			//输出替换后的字符串
		str=str.replace('J','j');				//替换字符串中的字符J为j
		System.out.println(str);			//输出替换后的字符串		
	}
}
