public class SubString {

	public static void main(String[] args) {
		String str = "相识，总是美丽；分别，总是优雅不起。";		// 定义字符串
		System.out.println(str);			// 输出原字符串
		// 截取字符串中索引位置从0到10（不包括10）所指定的子字符串
		String str1 = str.substring(0, 10);
		System.out.println(str1 + "……");  // 输出截取的子字符串，并添加省略号
	}
}
