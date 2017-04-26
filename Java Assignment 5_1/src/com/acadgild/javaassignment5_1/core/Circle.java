/**
 * this for files
 * @author Acer
 * 
 * @date Apr 26, 2017
 */
package com.acadgild.javaassignment5_1.core;

/**
 * this for classes
 */
	import java.util.*;

	// TODO: Auto-generated Javadoc
/**
	 * The Class Circle.
	 */
	public class Circle extends Figure {
		
		/** The pi. */
		double pi = Math.PI;

		/**
		 * Instantiates a new circle.
		 *
		 * @param d1 the d 1
		 * @param d2 the d 2
		 * @param d3 the d 3
		 */
		Circle(double d1, double d2, double d3) {
			super(d1, d2, d3);
		}

		/* (non-Javadoc)
		 * @see com.acadgild.javaassignment5_1.core.Figure#findArea()
		 */
		void findArea() {      // find area
			double area = pi * dimension1 * dimension1;    //these are dimension of area of circle.
			System.out.println("Area of Circle=" + area);  //print area of circle.
		}

		/* (non-Javadoc)
		 * @see com.acadgild.javaassignment5_1.core.Figure#findPerimeter()
		 */
		void findPerimeter() {    //find perimeter
			double perimeter = 2 * pi * dimension1;     //these are the dimensions of perimeter of circle.
			System.out.println("Perimeter of Circle=" + perimeter);   //print perimeter of circle.
		}  

	}

