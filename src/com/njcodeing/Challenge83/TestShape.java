package com.njcodeing.Challenge83;

public class TestShape {
    public static void main(String[] args) {
        Circle cir=new Circle(7.7);
        Square sqr=new Square(2.5);

        System.out.println("The Area of Circle is: "+cir.calculateArea());
        System.out.println("The Area of Square is: "+sqr.calculateArea());
    }
}
