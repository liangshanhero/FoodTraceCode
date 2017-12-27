package com;

public class Son extends Father {
	private String name = "SON";

	public Son() {
		whoAmI();
		tellName(name);
	}

	public void whoAmI() {
		System.out.println("Son says, I am " + this.name);

	}

	public void tellName(String name) {
		System.out.println("Son's name is " + name);
	}

	public static void main(String[] args) {
		Son s = new Son();

	}
}