
public class Example {


	public static void main(String[] args) {
		String str="3";									//�����ַ��ͱ���str����ʼֵΪ3
		System.out.println("byte��"+Byte.parseByte(str));		//ת��Ϊbyte��
		System.out.println("short��"+Short.parseShort(str));	//ת��Ϊshort��
		System.out.println("int��"+Integer.parseInt(str));			//ת��Ϊint��
		System.out.println("long��"+Long.parseLong(str));		//ת��Ϊlong��
		str="3.1415926535897932384626";					//����Ϊstr��ֵ
		System.out.println("float��"+Float.parseFloat(str));		//ת��Ϊfloat��
		System.out.println("double��"+Double.parseDouble(str));	//ת��Ϊdouble��


	}

}
