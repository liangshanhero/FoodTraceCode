public class SubString {

	public static void main(String[] args) {
		String str = "��ʶ�������������ֱ��������Ų���";		// �����ַ���
		System.out.println(str);			// ���ԭ�ַ���
		// ��ȡ�ַ���������λ�ô�0��10��������10����ָ�������ַ���
		String str1 = str.substring(0, 10);
		System.out.println(str1 + "����");  // �����ȡ�����ַ����������ʡ�Ժ�
	}
}
