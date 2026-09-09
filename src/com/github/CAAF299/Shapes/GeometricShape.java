package com.github.CAAF299.Shapes;

public abstract class GeometricShape implements Shape{

	private double base;
	private double height;


	GeometricShape(double base, double height){

	this.base = base;
	this.height = height;

	}


	public double getBase(){

	return this.base;

	}

	public double getHeight(){

	return this.height;

	}

}
