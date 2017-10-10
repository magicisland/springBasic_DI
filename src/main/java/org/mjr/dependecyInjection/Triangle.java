package org.mjr.dependecyInjection;

import java.util.List;

public class Triangle {

	protected Point pointA;
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
	protected Point pointB;
	protected Point pointC;

	public void draw(){
		
		System.out.println(pointA.getX()  + "  "  + pointB.getX() + "  "  + pointC.getX());
		
	}
}
