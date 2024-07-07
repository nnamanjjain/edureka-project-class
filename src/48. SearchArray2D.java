import java.util.Scanner;

class SearchArray2D {
    public static void main(String[] args) {
        System.out.println("Welcome to Searching in 2D Array");
        System.out.println("\nPlease Enter the elements in Array:");
        int[][] arr= ArrayUtility.input2dArray();
        ArrayUtility.display2dArray(arr);
        System.out.print("\nEnter the element you want to search: ");
        Scanner input=new Scanner(System.in);
        int element=input.nextInt();
        boolean isPresent= isPresentArr(arr,element);
        if(isPresent) {
            System.out.println("\nThe element entered is Present in the Array.");
        } else {
                System.out.println("\nThe element entered is NOT Present in the Array.");
        }
    }
    public static boolean isPresentArr(int[][] arr, int num){
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                if(arr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
