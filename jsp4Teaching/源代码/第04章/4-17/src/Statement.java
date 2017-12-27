public class Statement {

	public static void main(String[] args) {
		int sum = 0; 							// 定义保存计算结果的变量
		for (int i = 1; i < 100; i++) {
			sum += i; 							// 累加i的值
			if (sum <= 100) {					// 当累加和小于等于100时
				System.out.print(i + "  ");			// 输出i的值
			} else {							// 当累加和大于100时
				break;						// 跳出for循环
			}
		}
	}
}
