package com.github.CAAF299.Shapes;

import java.util.List;
import java.util.ArrayList;


public class Main{

public static void main(String[] args){


List<Shape>Shapes = new ArrayList<>();

Shapes.add(new SquarePrism());
Shapes.add(new Cylinder());
Shapes.add(new TriangularPrism());


for(Shape Obj : Shapes){

System.out.println(Obj.Calculable());

}




}

}
