public class StringEquals {

	public static void main(String[] args) {
		String str1 = "mr";
		String str2 = new String("mr");
		String str3 = new String("MR");
		String str4 = new String("mr");
		System.out.println(str1 == str2);					// ����ֵΪfalse
		System.out.println(str2.equals(str3));				// ����ֵΪfalse
		System.out.println(str2.equals(str4));				// ����ֵΪtrue
		System.out.println(str2.equalsIgnoreCase(str3));	// ����ֵΪtrue
		System.out.println(str2.equals(str1));				// ����ֵΪtrue
	}
}
