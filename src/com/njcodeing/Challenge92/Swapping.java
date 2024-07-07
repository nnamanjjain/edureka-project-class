package com.njcodeing.Challenge92;

import java.util.Arrays;
import java.util.List;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("Welcome to Swap array");
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(num);
        swapNum(num, 6,7);
        swapNum(num, 6,8);
    }

    public static void swapNum(List <Integer> l, int index1, int index2){
        int swap;
        if(index1< l.size() && index2<l.size()) {
            swap = l.get(index1);
            l.set(index1, l.get(index2));
            l.set(index2, swap);
            System.out.println(l);
        }else{
            System.out.println("Invalid Entry");
        }
    }
}
