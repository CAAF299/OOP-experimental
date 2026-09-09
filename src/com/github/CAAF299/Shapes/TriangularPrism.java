package com.github.CAAF299.Shapes;

public class TriangularPrism extends 3dShape{

	TriangularPrism(double base, double height){

	super(base, height);

	}

	@Override

	public void Calculable(double volume){


	volume =  getBase() * getHeight();

	return volume;

	}


}
