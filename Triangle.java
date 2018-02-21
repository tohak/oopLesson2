package com.konovalov;

public class Triangle extends Shape {
private Point a;
private Point b;
private Point c;




public Triangle(Point a, Point b, Point c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}


public Triangle() {
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


@Override
public String toString() {
	return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
}


@Override
double getPerimetr() {
	// TODO Auto-generated method stub
	return a.distance(b)+b.distance(c)+c.distance(a);
}
@Override
double getArea() {
	double p= (a.distance(b)+b.distance(c)+c.distance(a))/2;
	return Math.sqrt(p*(p-a.distance(b))*(p-b.distance(c))*(p-c.distance(a)));
}

}
