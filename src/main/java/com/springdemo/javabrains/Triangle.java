package com.springdemo.javabrains;

import java.util.List;

public class Triangle{
	
	private List<Point> points;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		
//		System.out.println("Point A = (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ")");
//		System.out.println("Point B = (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ")");
//		System.out.println("Point C = (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ")");
		for(Point point : points){
			System.out.println("Point= (" + point.getX() + ", " + point.getY() + ")");
		}

	}	
	
}
