package com.njcodeing.Challenge82;

public class TestArrayOperations {
    public static void main(String[] args) {
        ArrayOperations obj1=new ArrayOperations();
        // req bcz inner class is non-static / parameter is non-static also

        //ArrayOperations.arr=ArrayUtility.printArray();
        // in use if static parameter in ArrayOperations class

        obj1.arr=ArrayUtility.printArray();
        //ArrayOperations.Statistics obj=new ArrayOperations.Statistics();
        // in use if static nested class

        ArrayOperations.Statistics obj=obj1.new Statistics();
        //non-static class Statistics

        System.out.println(obj.mean());
        System.out.println(ArrayOperations.Statistics.median());// Median method is static
    }
}
