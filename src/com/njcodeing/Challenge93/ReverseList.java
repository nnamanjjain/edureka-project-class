package com.njcodeing.Challenge93;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse list");
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(num);

        reverseList(num);

        Collections.reverse(num);
        System.out.println(num);
    }
    public static void reverseList(List<Integer> l){
        List<Integer>num1= new ArrayList<>();
        for (int i=0; i<l.size(); i++) {
            num1.add(i, l.get(l.size() - 1 - i));
        }
        System.out.println(num1);
    }
}
