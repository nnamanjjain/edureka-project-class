package com.njcodeing.Challenge83;

public class Square extends Shape {
    private final double side;
    public Square(double side) {
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    @Override
    double calculateArea() {
        return Math.pow(this.side,2);
    }
}
