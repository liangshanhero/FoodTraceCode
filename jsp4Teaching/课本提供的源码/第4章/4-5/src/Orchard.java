public class Orchard {
	public String color = "��ɫ��";// �����Ա����

	public void harvest() {
		String color = "��ɫ";// ����ֲ�����
		System.out.println("ˮ���ǣ�" + color); // ����ֲ�����
		System.out.println("ˮ���Ѿ��ջ񡭡�");
		System.out.println("ˮ��ԭ���ǣ�" + this.color); // �����Ա����
	}

	public static void main(String[] args) {
		Orchard orchard = new Orchard();		//ʵ����Orchard��Ķ���
		orchard.harvest();		//ִ��harvest()����
	}
}