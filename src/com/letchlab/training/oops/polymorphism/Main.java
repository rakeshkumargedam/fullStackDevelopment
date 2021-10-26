package com.letchlab.training.oops.polymorphism;

/**
 * Shape
 * Triangle -- shape
 * Circle -- Shape
 * There are two types of Polymorphism
 * 1. Method Overriding -- method name is always same in same class or parent or child class and Method Arguments is
 * also same but outputs are different.
 * 2. Method Overloading
 *
 */
public class Main
{
    public static void main(String [] args) {

        Shape genericShap = new Shape();
        Shape triangeArea = new Triangle();
        Shape circleArea = new Circle();

        genericShap.area();
        triangeArea.area();
        genericShap.area();
        circleArea.area();
    }
}
