package com.konovalov;

public class Point {
	double x;
	double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
//dlina 
	public double distance(Point temp) {
		double x=Math.pow(this.getX()-temp.getX(), 2);
		double y=Math.pow(this.getY()-temp.getY(), 2);
		return Math.sqrt(x + y);
		
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
