class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max And Min Of an Array Program:");
        int[] arr=ArrayUtility.printArray();
        if(arr.length!=0) {
            int max = maxArr(arr);
            int min = minArr(arr);
            System.out.println("\nThe Max of the given Array is: " + max);
            System.out.println("The Min of the given Array is: " + min);
        }else{
            System.out.println("\nMax and Min is Not Possible.");
        }
    }

    public static int maxArr(int[] arr){
        int max=arr[0];
        int i=0;
        while  (i<arr.length){
            if(arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
    public static int minArr(int[] arr){
        int min=arr[0];
        int i=0;
        while  (i<arr.length){
            if(arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        return min;
    }
}
