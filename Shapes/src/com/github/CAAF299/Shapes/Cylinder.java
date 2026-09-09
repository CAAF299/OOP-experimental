package com.github.CAAF299.Shapes;

public class Cylinder extends GeometricShape{


	public Cylinder(double base, double height){

	super(base, height);

}


	@Override

	public double calcVolume(){

	return getBase() * getHeight();
}


}
