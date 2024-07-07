package com.njcodeing.Challenge87;

import java.util.Scanner;

public class DivisionClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Exception Handling\n");
        division();
    }
    public static void division(){
        try{
            Scanner input=new Scanner(System.in);
            System.out.print("Please Enter the first Number: ");
            int first=input.nextInt();
            System.out.print("Please Enter the Second Number: ");
            int second=input.nextInt();
            double result=(double)first/second;
            System.out.println("The Division of numbers is: "+result);
        }catch (ArithmeticException e){
            System.out.println("Exception came but handled with error: "+e.getMessage());
        }catch(Exception th){
            System.out.println("Exception Occurs with Error: "+th.getCause());
        }
    }
}
