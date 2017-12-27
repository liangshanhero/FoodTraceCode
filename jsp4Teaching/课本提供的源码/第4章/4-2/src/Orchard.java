
public class Orchard {
	public void grow() { // 无返回值的方法
		System.out.println("果树正在生长……");
	}

	public String ripe() {// 带返回值的方法
		System.out.println("果实已经成熟……");
		return "成熟";
	}

	public String harvest(String type) {// 带参数和返回值的方法
		System.out.println("水果已经收获……");
		String crop = "27个" + type;// 定义一个变量
		return crop;// 返回值
	}
}
