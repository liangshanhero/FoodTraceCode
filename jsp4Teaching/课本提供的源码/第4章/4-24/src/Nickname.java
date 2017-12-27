import java.util.ArrayList;
import java.util.List;

public class Nickname {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();		// 创建List集合对象
		list.add("琦琦");								// 添加第1个元素
		list.add("明日科技");								// 添加第2个元素
		list.add("无语");							// 添加第3个元素
		list.add(1, "宁宁");				// 在索引位置为1的位置插入一个元素“宁宁”
		// 遍历List集合对象
		for (int i = 0; i < list.size(); i++) {
			System.out.println("索引位置" + i + ":" + list.get(i));				// 输出当前位置的元素
		}
	}

}
