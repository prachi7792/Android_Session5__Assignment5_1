/**
 * this for files
 * @author Acer
 * 
 * @date Apr 26, 2017
 */
package com.acadgild.javaassignment5_1.core;

// TODO: Auto-generated Javadoc
/**
 * this for classes.
 */
	public class Main {
		
		/**
		 * The main method.
		 *
		 * @param args the arguments
		 */
		public static void main(String[] args) {
			Figure ob1 = new Circle(12, 0, 0);       // introduced radius to find perimeter and Area of Circle.
			Figure ob2 = new Rectangle(5, 7, 0);     // introduced Length and width to find area and perimeter of Rectangle
			Figure ob3 = new Triangle(8, 9, 5);      // introduced Base height and side to find area and perimeter
			System.out.println("Area and Perimeter of cirle for radius=" + ob1.dimension1);     // this message should be printed
			ob1.findArea();     // find area of circle
			ob1.findPerimeter();// find perimeter of circle
			System.out.println("");    // print message
			System.out.println("Now We will calculate area and perimeter of rectangle");       // this message will be printed
			System.out.println("Area and Perimeter of Rectangle length Length=" + ob2.dimension1 + "Width=" + ob2.dimension2);  //this message will be printed
			ob2.findArea();       // find area of rectangle.
			ob2.findPerimeter();  // find perimeter of rectangle.
			System.out.println("");    //print message
			System.out.println("Now We will calculate area and perimeter of Triangle");    //this message will be printed
			System.out.println("Area and Perimeter of Triangle for Base=" + ob3.dimension1 + "Height=" + ob3.dimension2
					+ "Side=" + ob3.dimension3);    //this message will be printed
			ob3.findArea();       // find area of circle
			ob3.findPerimeter();  // find perimeter of circle
		}
	}

