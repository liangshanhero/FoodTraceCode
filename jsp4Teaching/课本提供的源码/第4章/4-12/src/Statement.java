public class Statement {

	public static void main(String[] args) {
		int year = 2012;									// 定义保存年份的变量
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {		// 是闰年
			System.out.println(year + "年是闰年！");
		} else {											// 不是闰年
			System.out.println(year + "年不是闰年！");
		}
	}
}
