package com.njcodeing.Challenge82;

public class ArrayOperations {
    int[] arr;
    class Statistics{
        double mean(){
            double sum=0;
            for (int i : arr) {
                sum+=i;
            }
            return sum/arr.length;
        }
        static int median(){
            return 0;
        }
    }
}
