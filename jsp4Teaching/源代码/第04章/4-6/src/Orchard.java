public class Orchard {
	public String color;// ����һ����Ա����

	public Orchard() {
		color = "��ɫ";// ��ʼ����Ա����
	}
	//main()����
	public static void main(String[] args) {
		Orchard orchard = new Orchard(); // ʵ����Orchard��Ķ���
		System.out.println("��ɫ�ǣ�" + orchard.color);// �����Ա������ֵ
	}
}
