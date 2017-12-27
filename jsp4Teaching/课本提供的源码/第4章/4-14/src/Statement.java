public class Statement {

	public static void main(String[] args) {
		int sum = 0;										// 定义保存计算结果的变量
		for (int i = 1; i < 100; i++) {
			sum += i;										// 累加i的值
		}
		System.out.println("1到100之间所有整数的和是：" + sum);	//输出计算结果
	}
}
