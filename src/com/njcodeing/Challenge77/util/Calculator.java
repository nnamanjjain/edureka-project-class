package com.njcodeing.Challenge77.util;

import com.njcodeing.Challenge77.geometry.Circle;
import com.njcodeing.Challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to calculate Area\n");
        Circle cir=new Circle(7);
        Rectangle rec=new Rectangle(10,20);

        double areaOfCircle=Math.PI*Math.pow(cir.radius,2);
        double areaOfRec=rec.length*rec.breadth;

        System.out.printf("The area of Circle is: %f\nThe area of Rectangle is: %f",
                areaOfCircle,areaOfRec);
    }
}
