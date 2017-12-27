public class StringEquals {

	public static void main(String[] args) {
		String str1 = "mr";
		String str2 = new String("mr");
		String str3 = new String("MR");
		String str4 = new String("mr");
		System.out.println(str1 == str2);					// 返回值为false
		System.out.println(str2.equals(str3));				// 返回值为false
		System.out.println(str2.equals(str4));				// 返回值为true
		System.out.println(str2.equalsIgnoreCase(str3));	// 返回值为true
		System.out.println(str2.equals(str1));				// 返回值为true
	}
}
