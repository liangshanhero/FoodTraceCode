package com.wgh;
public class Produce {
	// 商品名称
	private String name = "编程词典个人版";
	// 商品价格
	private double price = 298;
	// 数量
	private int count = 10;
	// 出厂地址
	private String factoryAdd = "吉林省明日科技有限公司";
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setFactoryAdd(String factoryAdd) {
		this.factoryAdd = factoryAdd;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public String getFactoryAdd() {
		return factoryAdd;
	}
}
