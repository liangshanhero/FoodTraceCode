public class Statement {

	public static void main(String[] args) {
		int i = 0;						// ����ѭ������
		while (i < 10) {
			i++;						// �ۼ�i��ֵ
			if (i % 2 == 0) {				// ��i��ֵ�ܱ�2��������ʾ������������
				continue; 				// ������һ��ѭ��
			}
			System.out.print(i + "  ");		// ���i��ֵ
		}
	}
}
