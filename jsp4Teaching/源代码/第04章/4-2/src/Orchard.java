
public class Orchard {
	public void grow() { // �޷���ֵ�ķ���
		System.out.println("����������������");
	}

	public String ripe() {// ������ֵ�ķ���
		System.out.println("��ʵ�Ѿ����졭��");
		return "����";
	}

	public String harvest(String type) {// �������ͷ���ֵ�ķ���
		System.out.println("ˮ���Ѿ��ջ񡭡�");
		String crop = "27��" + type;// ����һ������
		return crop;// ����ֵ
	}
}
