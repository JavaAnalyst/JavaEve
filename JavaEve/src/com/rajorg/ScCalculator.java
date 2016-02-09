package com.rajorg;

public class ScCalculator {

	int length = 5;
	int width = 3;
	int height = 3;

	public int Square(int length, int width) {
		this.length = length;
		this.width = width;
		return length * width;
	}

	public int cube(int length, int width, int height) {
		this.height = height;
		this.length = length;
		this.width = width;
		return length * width * height;
	}
}
