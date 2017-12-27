
public class Example {


	public static void main(String[] args) {
		String str="3";									//定义字符型变量str，初始值为3
		System.out.println("byte："+Byte.parseByte(str));		//转换为byte型
		System.out.println("short："+Short.parseShort(str));	//转换为short型
		System.out.println("int："+Integer.parseInt(str));			//转换为int型
		System.out.println("long："+Long.parseLong(str));		//转换为long型
		str="3.1415926535897932384626";					//重新为str赋值
		System.out.println("float："+Float.parseFloat(str));		//转换为float型
		System.out.println("double："+Double.parseDouble(str));	//转换为double型


	}

}
