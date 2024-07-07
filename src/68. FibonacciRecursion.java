import java.util.Scanner;

class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to Print Fibonacci Series.\n");
        System.out.print("Please Enter the number up to which you want to print the series: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for (int i = 1; i <= num; i++) {
            if (printFibonacci(i)> num) {
                break;
            } 
            System.out.print(printFibonacci(i)+" ");
        }
    }
    public static int printFibonacci(int position){
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
       return printFibonacci(position-1)+printFibonacci(position-2);
    }

}
