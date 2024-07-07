package com.njcodeing.Challenge89;

import java.util.Scanner;

public class Challenge {
    public static void main(String... args) {
        System.out.println("Welcome to Concatenate String\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter number of strings you want to enter: ");
        int noOfString=input.nextInt();
        String[] str=new String[noOfString];
        for (int i = 0; i < noOfString; i++) {
            System.out.printf("Please Enter the %d element: ",i+1);
            str[i]=input.next();
        }
        concatString(str);
    }
    public static void concatString(String...str){
        for (String s : str) {
         StringBuilder line=new StringBuilder();
         System.out.print(line.append(s).append(" "));
        }
    }
}
