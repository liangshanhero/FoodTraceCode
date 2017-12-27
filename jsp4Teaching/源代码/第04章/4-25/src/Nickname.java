import java.util.Vector;

public class Nickname {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(); // 创建Vector对象
		v.add("琦琦"); // 添加第1个元素
		v.add("宁宁"); // 添加第2个元素
		v.add("明日科技"); // 添加第3个元素
		v.add(0, "无语"); // 在索引位置为1的位置插入一个元素“无语”
		// 遍历List集合对象
		for (int i = 0; i < v.size(); i++) {
			// 输出当前位置的元素
			System.out.print("索引位置" + i + ":" + v.elementAt(i) + "  ");
		}
		v.remove(2); // 移除索引位置为2的元素
		System.out.println("\r\n删除索引位置为2的元素后：");
		// 遍历List集合对象
		for (int i = 0; i < v.size(); i++) {
			// 输出当前位置的元素
			System.out.print("索引位置" + i + ":" + v.elementAt(i) + "  ");
		}
	}
}
