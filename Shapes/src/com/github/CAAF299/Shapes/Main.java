package com.github.CAAF299.Shapes;

import java.util.List;
import java.util.ArrayList;


public class Main{

public static void main(String[] args){


List<Shape>Shapes = new ArrayList<>();

Shapes.add(new SquarePrism(4.0, 5.0));
Shapes.add(new Cylinder(3.0, 2.0));
Shapes.add(new TriangularPrism(6.0, 9.0));


for(Shape Obj : Shapes){

System.out.println(Obj.calcVolume());

}




}

}
