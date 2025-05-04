package com.camelia.inherit;

import com.camelia.inherit.model.B;
public class App {

	public static void main(String[] args) {
		B obj1 = new B(10,"AA",20,"BB");
		System.out.println(obj1.displayA());
		System.out.println(obj1);

	}

}
