package com.bae.app;

public class Circle implements Shape {
	private String color;
	private int x;
	private int y;
	private int radius;
	private final String name = "Circle";

	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println(
				"Name: " + name + " Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	}
}
