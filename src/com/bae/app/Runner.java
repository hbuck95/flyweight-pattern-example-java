package com.bae.app;

public class Runner {
	private static final String colors[] = { "Red", "Blue", "Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();

			Square square = (Square) ShapeFactory.getSquare(getRandomColor());
			square.setX(getRandomX());
			square.setPerimeter();
			square.draw();

		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 50);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 50);
	}
}
