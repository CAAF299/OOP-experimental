package com.github.CAAF299.Areas;

import java.util.List;
import java.util.ArrayList;
import com.github.CAAF299.Areas.shapes.*;
import com.github.CAAF299.Areas.except.*;


public class Main{


public static void main(String[] args){


List<Shape>Shapes = new ArrayList<>();

Shapes.add(new Cone(2, 4.5));
Shapes.add(new Cylinder(12));
Shapes.add(new Sphere(7.6));

for(Shape Obj : Shapes){

System.out.println(Obj.calculateArea());

}


}
}
