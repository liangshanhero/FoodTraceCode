public class Orchard {
	public String color = "绿色的";// 定义成员变量

	public void harvest() {
		String color = "橙色";// 定义局部变量
		System.out.println("水果是：" + color); // 输出局部变量
		System.out.println("水果已经收获……");
		System.out.println("水果原来是：" + this.color); // 输出成员变量
	}

	public static void main(String[] args) {
		Orchard orchard = new Orchard();		//实例化Orchard类的对象
		orchard.harvest();		//执行harvest()方法
	}
}