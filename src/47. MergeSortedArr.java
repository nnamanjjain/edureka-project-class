class MergeSortedArr {
    public static void main(String[] args) {
        System.out.println("\nWelcome to The Program where we merge two sorted Arrays");
        System.out.println("\nFor Sorted Array 1:--");
        int[] arr1=ArrayUtility.printArray();
        System.out.println("\nFor Sorted Array 2:--");
        int[] arr2=ArrayUtility.printArray();
        int[] mergeArr=mergeArr(arr1, arr2);
        System.out.println("\nMerged Sorted Array is Below:--");
        ArrayUtility.displayArray(mergeArr);
    }

    public static int[] mergeArr(int[] arr1, int[] arr2){
        int newSize=arr1.length + arr2.length;
        int[] newArr= new int[newSize];
        int i=0, j=0, k=0;    //  1 3
        while(k<newSize){     //  2 4 5 7
            if(j==arr2.length || (i<arr1.length && arr1[i]<arr2[j])){//1 2 3 4 i=2 j=2 k=4
              newArr[k]=arr1[i];
              k++;
              i++;
            }else {
                newArr[k]=arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
