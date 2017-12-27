public class Operate {
	public static void main(String[] args) {
		int number = 60;								// 定义变量number，并赋初值60
		boolean result1 = number > 60 && number < 90;			// 执行逻辑与运算
		boolean result2 = number > 90 || number <= 60;			// 执行逻辑或运算
		boolean result3 = !(number > 60);						// 执行逻辑非运算
		System.out.println(result1 + "\r" + result2 + "\r" + result3);//输出运算结果
	}
}
