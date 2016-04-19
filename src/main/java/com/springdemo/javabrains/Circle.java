package com.springdemo.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape{
	
//	@Autowired
	@Resource
	private Point center;
	
	public Point getCenter() {
		return center;
	}	

	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle center point is: (" + center.getX() + ", " + center.getY() + ")");
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle");
	}

}
