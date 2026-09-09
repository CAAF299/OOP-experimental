package com.github.CAAF299.Shapes;

public class Cylinder extends 3dShape{



	public Cylinder(double base, double height){

	super(base, height);

	@Override

	public void Calculable(double volume){

	volume = getBase() * getHeight();

	return volume;

	}


}
