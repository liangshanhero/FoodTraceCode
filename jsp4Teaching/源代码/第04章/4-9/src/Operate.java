public class Operate {
	public static void main(String[] args) {
		int number = 60;								// �������number��������ֵ60
		boolean result1 = number > 60 && number < 90;			// ִ���߼�������
		boolean result2 = number > 90 || number <= 60;			// ִ���߼�������
		boolean result3 = !(number > 60);						// ִ���߼�������
		System.out.println(result1 + "\r" + result2 + "\r" + result3);//���������
	}
}
