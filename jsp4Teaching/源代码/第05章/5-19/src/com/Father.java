package com;

public class Father {
private String name = "FATHER";

public Father() {
whoAmI();
tellName(name);
}

public void whoAmI() {
System.out.println("Father says, I am " + name);
}

public void tellName(String name) {
System.out.println("Father's name is " + name);
}
public static void main(String[] args) {
Father f=new Father();

}
}
