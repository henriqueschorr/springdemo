package com.springdemo.javabrains;

import org.springframework.beans.factory.annotation.Autowired;

public class Triangle implements Shape{
	
	@Autowired
	private Point pointA;
	@Autowired
	private Point pointB;
	@Autowired
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A = (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ")");
		System.out.println("Point B = (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ")");
		System.out.println("Point C = (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ")");
	}	
}
