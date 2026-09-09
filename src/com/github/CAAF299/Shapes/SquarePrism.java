package com.github.CAAF299.Shapes;

public class SquarePrism extends GeometricShape{


	SquarePrism(double base, double height){

	super(base, height);


	}

	@Override

	public double calcVolume(){

	return (1.0/3.0) * getBase() * getHeight();


	}


}
