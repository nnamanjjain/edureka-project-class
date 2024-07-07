package com.njcodeing.Challenge91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequecy {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,6,2,3,45,1,2,5,6,7,8,9);
        System.out.println(Collections.frequency(num, 2));
        System.out.println(Collections.frequency(num, 1));
        System.out.println(Collections.frequency(num, 3));
        System.out.println(Collections.frequency(num, 4));
        System.out.println(Collections.frequency(num, 5));
        System.out.println(Collections.frequency(num, 7));
    }

}

