package com.njcodeing.Challenge95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringToUniqueChar {
    public static void main(String[] args) {
        System.out.println("Welcome to String to unique Char\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter any string: ");
        String name=input.next();
        stringToChar(name);
    }
    public static void stringToChar(String str){
        Set<Character> charSet=new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {

            charSet.add(str.charAt(i));
        }
        System.out.println(charSet);
        System.out.printf("The uniques Characters in String %s is %d.",str,charSet.size());
    }
}
