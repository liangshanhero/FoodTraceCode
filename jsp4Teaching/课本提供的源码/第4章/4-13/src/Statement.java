public class Statement {

	public static void main(String[] args) {
		int week = 1;							// 定义表示数字星期的变量
		switch (week) {						// 指定switch语句的表达式为变量week
		case 1:								// 常量值为1
			System.out.println("星期日");
			break;							// 跳出switch语句
		case 2:								// 常量值为2
			System.out.println("星期一");
			break;
		case 3:								// 常量值为3
			System.out.println("星期二");
			break;
		case 4:								// 常量值为4
			System.out.println("星期三");
			break;
		case 5:								// 常量值为5
			System.out.println("星期四");
			break;
		case 6:								// 常量值为6
			System.out.println("星期五");
			break;
		default:								// 默认语句
			System.out.println("星期六");
		}
	}
}
