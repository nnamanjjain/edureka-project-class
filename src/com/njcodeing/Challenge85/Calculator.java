package com.njcodeing.Challenge85;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(9,10,15));
        System.out.println(calc.add(5.65,2.35));
    }
}
