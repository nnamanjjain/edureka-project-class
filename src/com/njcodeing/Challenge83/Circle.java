package com.njcodeing.Challenge83;

class Circle extends Shape{
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    double calculateArea() {
      return Math.PI * Math.pow(this.radius,2);
    }
}
