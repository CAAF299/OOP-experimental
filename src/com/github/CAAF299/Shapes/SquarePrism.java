package com.github.CAAF299.shapes;

public class SquarePrism extends 3dShape{


	SquarePrism(double base, double height ){

	super(base, height)


	}

	@Override

	public void Calculable(double volume){

	volume = (1/3) * getBase() * getHeight();

	}


}
