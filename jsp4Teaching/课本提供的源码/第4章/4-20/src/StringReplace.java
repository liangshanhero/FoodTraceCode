public class StringReplace {

	public static void main(String[] args) {
		String str="javaScript and java";		//�����ַ���
		str=str.replace("ja","Ja");		//�滻�ַ����е��ַ���jaΪJa
		System.out.println(str);			//����滻����ַ���
		str=str.replace('J','j');				//�滻�ַ����е��ַ�JΪj
		System.out.println(str);			//����滻����ַ���		
	}
}
