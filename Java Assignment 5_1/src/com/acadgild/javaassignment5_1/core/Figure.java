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
 abstract class Figure {
			
			/** The dimension 3. */
			double dimension1, dimension2, dimension3;

			/**
			 * Instantiates a new figure.
			 *
			 * @param d1 the d 1
			 * @param d2 the d 2
			 * @param d3 the d 3
			 */
			Figure(double d1, double d2, double d3) {
				dimension1 = d1;
				dimension2 = d2;
				dimension3 = d3;
			}

			/**
			 * Find area.
			 */
			abstract void findArea();

			/**
			 * Find perimeter.
			 */
			abstract void findPerimeter();
		}


