package com.njcodeing.Challenge90;

import java.util.*;

public class StringOrder {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Naman", "Akash", "Akansha", "Ajit", "Ram");
        System.out.println(str);
        stringInDescendingOrder1(str);
        System.out.println(str);
        stringInDescendingOrder2(str);
        System.out.println(str);
    }

    public static void stringInDescendingOrder1(List<String> l){
        Collections.sort(l, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1==o2){
                    return 0;
                }else if(o1.charAt(0) > o2.charAt(0)){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
    }

    public static void stringInDescendingOrder2(List<String> l){
        Collections.sort(l);
        Collections.reverse(l);
    }
}
