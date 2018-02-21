package com.konovalov;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a = new Point(1, 1);
		Point b = new Point(0, 3);
		Point c = new Point(3, 0);
		Point d = new Point(3, 4);
		
		Circle cirkleOne=new Circle(a,b);
		Triangle triangleOne=new Triangle(a,b,c);
		Quadrilateral QuadrilateralOne=new Quadrilateral(a,b,c,d);
		
		Board boardOne=new Board();
		
		boardOne.add(cirkleOne, 1);
		boardOne.add(triangleOne, 2);
		boardOne.add(QuadrilateralOne, 4);
		System.out.println(boardOne);
		
		boardOne.delete(2);
		System.out.println();
		System.out.println(boardOne);
		
		
		
	}

}
