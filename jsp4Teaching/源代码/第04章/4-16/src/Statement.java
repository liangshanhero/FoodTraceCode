public class Statement {

	public static void main(String[] args) {
		int i = 1;											// ����ѭ������i
		int sum = 0; 									// ���屣��������ı���
		do {
			sum += i;										// �ۼ�i��ֵ
			i++;											// ��i��ֵ��1
		} while (i < 100);
		System.out.println("1��100֮�����������ĺ��ǣ�" + sum); 	// ���������
	}
}
