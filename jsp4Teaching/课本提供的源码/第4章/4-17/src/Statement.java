public class Statement {

	public static void main(String[] args) {
		int sum = 0; 							// ���屣��������ı���
		for (int i = 1; i < 100; i++) {
			sum += i; 							// �ۼ�i��ֵ
			if (sum <= 100) {					// ���ۼӺ�С�ڵ���100ʱ
				System.out.print(i + "  ");			// ���i��ֵ
			} else {							// ���ۼӺʹ���100ʱ
				break;						// ����forѭ��
			}
		}
	}
}
