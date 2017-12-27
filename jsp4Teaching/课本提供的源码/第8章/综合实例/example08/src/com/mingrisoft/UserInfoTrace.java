package com.mingrisoft;

import javax.servlet.http.HttpSessionBindingEvent;

public class UserInfoTrace implements
		javax.servlet.http.HttpSessionBindingListener {
	private String user;
	private UserInfoList container = UserInfoList.getInstance();	//获得UserInfoList类的对象

	public UserInfoTrace() {
		user = "";
	}

	// 设置在线监听人员
	public void setUser(String user) {
		this.user = user;
	}

	// 获取在线监听
	public String getUser() {
		return this.user;
	}
	//当Session有对象加入时执行的方法
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("[ " + this.user + " ]上线");
	}
	//当Session有对象移除时执行的方法
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("[ " + this.user + " ]下线");
		if (user != "") {
			container.removeUserInfo(user);
		}
	}
}
