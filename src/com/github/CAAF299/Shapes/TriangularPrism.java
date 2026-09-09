package com.github.CAAF299.Shapes;

public class TriangularPrism extends GeometricShape{

	TriangularPrism(double base, double height){

	super(base, height);

	}

	@Override

	public double calcVolume(){


	return  getBase() * getHeight();


	}


}
