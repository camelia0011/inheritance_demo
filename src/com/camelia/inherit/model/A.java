package com.camelia.inherit.model;

public class A {
	private int noA;
	private String str;
	public int x=100;
	
	public A() {
		super();
		System.out.println("Without arguement constructor in A");
	}

	public A(int noA, String str) {
		super();
		this.noA = noA;
		this.str = str;
		System.out.println("With arguement constructor in A");
	}

	public int getNoA() {
		return noA;
	}
	public void setNoA(int noA) {
		this.noA = noA;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "A [noA=" + noA + ", str=" + str + "]";
	}
	public void show() {
		System.out.println("Show() in A");
	}
}
