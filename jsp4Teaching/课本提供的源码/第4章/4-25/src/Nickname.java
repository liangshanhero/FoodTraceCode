import java.util.Vector;

public class Nickname {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(); // ����Vector����
		v.add("����"); // ��ӵ�1��Ԫ��
		v.add("����"); // ��ӵ�2��Ԫ��
		v.add("���տƼ�"); // ��ӵ�3��Ԫ��
		v.add(0, "����"); // ������λ��Ϊ1��λ�ò���һ��Ԫ�ء����
		// ����List���϶���
		for (int i = 0; i < v.size(); i++) {
			// �����ǰλ�õ�Ԫ��
			System.out.print("����λ��" + i + ":" + v.elementAt(i) + "  ");
		}
		v.remove(2); // �Ƴ�����λ��Ϊ2��Ԫ��
		System.out.println("\r\nɾ������λ��Ϊ2��Ԫ�غ�");
		// ����List���϶���
		for (int i = 0; i < v.size(); i++) {
			// �����ǰλ�õ�Ԫ��
			System.out.print("����λ��" + i + ":" + v.elementAt(i) + "  ");
		}
	}
}
