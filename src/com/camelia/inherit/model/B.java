package com.camelia.inherit.model;

public class B extends A {
	private int noB;
	private String strB;
	public int x=1000;
	
	public B() {
		super();
		System.out.println("Without arguement constructor in B");
	}
	public B(int noA, String str,int noB, String strB) {
		super(noA, str); //TO INVOKE THE CONSTRUCTOR of the parent class
		System.out.println("With arguement constructor in B");
		this.noB = noB;
		this.strB = strB;
	}
	public int getNoB() {
		return noB;
	}
	public void setNoB(int noB) {
		this.noB = noB;
	}
	public String getStrB() {
		return strB;
	}
	public void setStrB(String strB) {
		this.strB = strB;
	}
	public String displayA(){
		return "A [noA=" + getNoA() + ", strA=" + getStr() + "]";
	}
	@Override
	public String toString() {
		return "B [noB=" + noB + ", strB=" + strB + "]";
	}
	@Override
	public void show() {
		super.show();
		System.out.println("Show() in B"); //overriding method of superclass
	}
	public void showX() {
		System.out.println("A's x= "+super.x);
		System.out.println("B's x= "+x);
	}

}
