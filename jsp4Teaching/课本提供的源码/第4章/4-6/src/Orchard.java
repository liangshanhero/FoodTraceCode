public class Orchard {
	public String color;// 定义一个成员变量

	public Orchard() {
		color = "绿色";// 初始化成员变量
	}
	//main()方法
	public static void main(String[] args) {
		Orchard orchard = new Orchard(); // 实例化Orchard类的对象
		System.out.println("颜色是：" + orchard.color);// 输出成员变量的值
	}
}
