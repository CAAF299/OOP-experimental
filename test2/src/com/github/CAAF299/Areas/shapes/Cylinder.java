package com.github.CAAF299.Areas.shapes;

import com.github.CAAF299.Areas.except.NoValueException;


public class Cylinder extends Shape{

	public Cylinder(double radius){

	super (radius);

	}

	public double calculateArea(){

	if (getRadius() <= 0 ){

	throw new NoValueException("ERROR : Value must be positive. Provided : " + getRadius());

	}


	return (2 * PI * getRadius()) + ((2 * PI * getRadius()) * (2 * PI * getRadius()));

	}

}
