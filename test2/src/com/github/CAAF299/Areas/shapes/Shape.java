package com.github.CAAF299.Areas.shapes;


public abstract class Shape implements Area{


	public static final double PI = 3.1416;

	private double radius;

	public Shape(double radius){

	this.radius = radius;

	}


	public double getRadius(){

	return this.radius;

	}



}
