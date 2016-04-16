package com.springdemo.javabrains;

public class Triangle{
	
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

	public void draw() {		
		System.out.println("Point A = (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ")");
		System.out.println("Point B = (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ")");
		System.out.println("Point C = (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ")");
	}

//	public void afterPropertiesSet() throws Exception {
//		System.out.println("InitializingBean init method called for Triangle");
//	}
//
//	public void destroy() throws Exception {
//		System.out.println("DisposableBean destroy method called for Triangle");
//	}	
	
	public void myInit(){
		System.out.println("My init method called for Triangle");
	}
	
	public void cleanUp(){
		System.out.println("My destroy method called for Triangle");
	}
	
}
