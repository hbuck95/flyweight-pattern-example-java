package com.bae.app;

public class Square implements Shape {

	private String color;
	private int x;
	private final String name = "Square";

	private int perimeter;

	public Square(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setPerimeter() {
		perimeter = x * 4;
	}

	@Override
	public void draw() {
		System.out.println("Name: " + name + " Draw() [Color : " + color + ", x1 : " + x + ", x2 :" + x + "x3 : " + x
				+ ", x4 :" + x + ", Perimeter :" + perimeter);
	}

}
