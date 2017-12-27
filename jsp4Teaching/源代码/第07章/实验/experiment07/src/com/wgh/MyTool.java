package com.wgh;

public class MyTool {
	public static String changeES(String str) {
		if (!"".equals(str) && str != null) {
			str = str.replaceAll(" ", "&nbsp;"); // 替换空格
			str = str.replaceAll("\r\n", "<br>"); // 替换回车换行符
		} else {
			str = "无留言内容！"; // 设置默认显示内容
		}
		return str;
	}
}
