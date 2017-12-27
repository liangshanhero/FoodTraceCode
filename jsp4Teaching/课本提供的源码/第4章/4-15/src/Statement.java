public class Statement {

	public static void main(String[] args) {
		int i = 1;											// 定义循环增量i
		int sum = 0;										// 定义保存计算结果的变量
		while (i < 100) {
			sum += i;										// 累加i的值
			i++;											// 将i的值加1
		}
		System.out.println("1到100之间所有整数的和是：" + sum); 	// 输出计算结果
	}
}
