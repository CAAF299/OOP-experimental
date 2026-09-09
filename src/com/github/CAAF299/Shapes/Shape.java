package com.github.CAAF299.Shapes;

public interface Shape{

	void Calculable(double volume);
}

public abstract class 3dShape implements Shape{


	private double base;
	private double height;

	public 3dShape(double base, double height){

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
