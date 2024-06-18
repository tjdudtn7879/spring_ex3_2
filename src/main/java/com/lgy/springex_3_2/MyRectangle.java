package com.lgy.springex_3_2;

public class MyRectangle {
	int width,height;
	Rectangle rectangle;
	
	public void ar() {
		rectangle.area(width, height);
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	
	
	
	
}
