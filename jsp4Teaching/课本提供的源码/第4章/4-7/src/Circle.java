public class Circle {
	final float PI = 3.14159f;					// 定义常量
	public float r = 0.0f;						// 定义成员变量

	public Circle() {							// 构造方法
		r = 10; 								// 指定圆的半径
	}

	public float getArea() {
		float area = PI * r * r; 				// 计算圆面积
		return area; 							// 返回计算后的圆面积
	}
	//main()方法
	public static void main(String[] args) {
		Circle c = new Circle();				// 创建Circle的对象
		float area = c.getArea();				// 调用成员方法
		float r = c.r; 							// 调用成员变量
		System.out.println("半径为 " + r + " 的圆的面积为：" + area);
	}
}
