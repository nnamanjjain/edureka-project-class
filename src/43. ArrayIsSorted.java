class ArrayIsSorted {
    public static void main(String[] args) {
        System.out.println("Welcome to program to check if Array is sorted or not:");
        int[] arr=ArrayUtility.printArray();
        boolean isSorted= isSortedArr(arr);
        if(isSorted){
            System.out.println("The Given Array is Sorted.");
        }else{
            System.out.println("The Given Array is NOT Sorted.");
        }
    }

    public static boolean isSortedArr(int[] arr){
        boolean isInc= isIncArr(arr);
        boolean isDec= isDecArr(arr);
        return (isInc || isDec);
    }

    public static boolean isIncArr(int[] arr){
        int i=1;//1 2 3 2
        while(i<arr.length){
            if(arr[i]< arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecArr(int[] arr){
        int i=1;//3 2 1 2
        while(i<arr.length){
            if(arr[i]> arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
