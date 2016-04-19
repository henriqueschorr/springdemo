package com.springdemo.javabrains;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape{
	
	@Autowired
	private Point center;
	
	public Point getCenter() {
		return center;
	}	

	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle center point is: (" + center.getX() + ", " + center.getY() + ")");
	}

}
