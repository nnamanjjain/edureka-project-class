import java.util.Scanner;

class DeleteElementArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Print Array after deleting the desired element:");
        int[] arr= ArrayUtility.printArray();
        Scanner input= new Scanner(System.in);
        System.out.print("\nPlease Enter the element you want to delete from Array: ");
        int del_ele=input.nextInt();
        int[] newArr=newArrDel(arr, del_ele);
        ArrayUtility.displayArray(newArr);
    }

    public static int[] newArrDel(int[] arr, int num){
        int newSize=arr.length - (OccurrencesArray.arrayOccur(arr, num));
        int[] newArr=new int[newSize];
        if(newSize==arr.length){
            System.out.println("\nElement not found in array, Array remains the same:");
            return arr;
        }
        int i=0, count=0;//    1 2 6 5 4 6 8 6
        while(i<arr.length){// 0 1 2 3 4 5 6 7
            if(arr[i]!=num){// 1 2 5 4 8
                newArr[count]=arr[i];
                count++;
            }
            i++;
        }
        System.out.println("\nThe New Array is formed.");
        return newArr;
    }
}
