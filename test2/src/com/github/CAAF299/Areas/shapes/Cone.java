package com.github.CAAF299.Areas.shapes;

import com.github.CAAF299.Areas.except.NoValueException;

public class Cone extends Shape{

	private double surface;


 	public Cone(double radius, double surface){

	super(radius);

	this.surface = surface;

	}

	public double calculateArea(){

	if(surface <= 0 || getRadius() <= 0){

	throw new NoValueException("ERROR: Values must be positive. Provided - Surface : " + surface + "Radius: " + getRadius() );

	}

	return (PI*getRadius()*this.surface) + (PI*(getRadius() * getRadius()));

	}


}
