package com.github.CAAF299.Areas.shapes;

import com.github.CAAF299.Areas.except.NoValueException;

public class Sphere extends Shape{

	public Sphere(double radius){

	super (radius);

	}

	public double calculateArea(){

	if (getRadius() <= 0){

	throw new NoValueException("ERROR: Values must be positive. Provided - Radius : " + getRadius());
}

	return 4 * PI * (getRadius() * getRadius());



}

}
