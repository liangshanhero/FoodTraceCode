public class Circle {
	final float PI = 3.14159f;					// ���峣��
	public float r = 0.0f;						// �����Ա����

	public Circle() {							// ���췽��
		r = 10; 								// ָ��Բ�İ뾶
	}

	public float getArea() {
		float area = PI * r * r; 				// ����Բ���
		return area; 							// ���ؼ�����Բ���
	}
	//main()����
	public static void main(String[] args) {
		Circle c = new Circle();				// ����Circle�Ķ���
		float area = c.getArea();				// ���ó�Ա����
		float r = c.r; 							// ���ó�Ա����
		System.out.println("�뾶Ϊ " + r + " ��Բ�����Ϊ��" + area);
	}
}
