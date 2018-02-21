package com.konovalov;

public class Quadrilateral extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Quadrilateral(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Quadrilateral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Quadrilateral [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a);
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double p = (a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a)) / 2;
		return Math.sqrt((p-a.distance(b))*(p-b.distance(c))*(p-c.distance(d))*(p-d.distance(a)));
	}

}
