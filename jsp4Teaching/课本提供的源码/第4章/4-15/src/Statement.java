public class Statement {

	public static void main(String[] args) {
		int i = 1;											// ����ѭ������i
		int sum = 0;										// ���屣��������ı���
		while (i < 100) {
			sum += i;										// �ۼ�i��ֵ
			i++;											// ��i��ֵ��1
		}
		System.out.println("1��100֮�����������ĺ��ǣ�" + sum); 	// ���������
	}
}
