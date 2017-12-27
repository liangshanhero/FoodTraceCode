package com.mingrisoft;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener		//配置监听器
public class FirstListener implements ServletContextListener {

    /**
     * 默认构造方法 
     */
    public FirstListener() {
    }

	/**
     * Servlet上下文初始化成功时触发的方法
     */
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("初始化");
    }

	/**
     * Servlet上下文被销毁时触发的方法
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("销毁");
    }
}
