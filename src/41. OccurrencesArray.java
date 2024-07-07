import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurrences");
        int[] arr=ArrayUtility.printArray();
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter the element to find: ");
        int num=input.nextInt();
        int occur=arrayOccur(arr, num);
        System.out.println("The element "+num+" is occurred "+occur+" times in the given array");
    }
    public static int arrayOccur(int[] arr, int num){
        int i=0, count=0;
        while(i<arr.length){
            if(arr[i]==num){
                count++;
            }
            i++;
        }
        return count;
    }
}
