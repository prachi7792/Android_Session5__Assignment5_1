/**
 * this for files
 * @author Acer
 * 
 * @date Apr 26, 2017
 */
package com.acadgild.javaassignment5_1.core;

// TODO: Auto-generated Javadoc
/**
 * this for classes figure of triangle.
 */

	public class Triangle extends Figure {
		
		/**
		 * Instantiates a new triangle.
		 *
		 * @param d1 the d 1
		 * @param d2 the d 2
		 * @param d3 the d 3
		 */
		Triangle(double d1, double d2, double d3) {
			super(d1, d2, d3);
		}

		/* (non-Javadoc)
		 * @see com.acadgild.javaassignment5_1.core.Figure#findArea()
		 */
		void findArea() {      // find area
			double area = (dimension1 * dimension2) / 2;      //these are dimension of area of triangle.
			System.out.println("Area of Triangle=" + area);   //print area of triangle. 
		}

		/* (non-Javadoc)
		 * @see com.acadgild.javaassignment5_1.core.Figure#findPerimeter()
		 */
		void findPerimeter() {    //find perimeter
			double perimeter = dimension1 + dimension2 + dimension3;   //these are the dimensions of perimeter of triangle 
			System.out.println("Perimeter of Triangle=" + perimeter);  //print perimeter of triangle

		}

	}

