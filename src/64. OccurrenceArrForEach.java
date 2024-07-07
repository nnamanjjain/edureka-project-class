import java.util.Scanner;

class OccurrenceArrForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to check Occurrences of number\n");
        System.out.println("Please Enter the array First:");
        int[] arr=ArrayUtility.printArray();
        Scanner input=new Scanner(System.in);
        System.out.print("Now, Please Enter the number to check occurrences: ");
        int num=input.nextInt();

        int occurTimes=occurNumArrForEach(arr, num); //method call
        System.out.println("The number "+num+" Occurred "+ occurTimes+" times.");
    }
    public static int occurNumArrForEach(int[] arr, int num){
        int count=0;
        for(int element : arr){
            if(element==num){
                count+=1;
            }
        }
        return count;
    }
}
