import java.util.ArrayList;
import java.util.List;

public class Nickname {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();		// ����List���϶���
		list.add("����");								// ��ӵ�1��Ԫ��
		list.add("���տƼ�");								// ��ӵ�2��Ԫ��
		list.add("����");							// ��ӵ�3��Ԫ��
		list.add(1, "����");				// ������λ��Ϊ1��λ�ò���һ��Ԫ�ء�������
		// ����List���϶���
		for (int i = 0; i < list.size(); i++) {
			System.out.println("����λ��" + i + ":" + list.get(i));				// �����ǰλ�õ�Ԫ��
		}
	}

}
