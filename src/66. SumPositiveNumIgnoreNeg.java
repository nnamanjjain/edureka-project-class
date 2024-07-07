import java.util.Scanner;

class SumPositiveNumIgnoreNeg {
    public static void main(String[] args) {
        System.out.println("Welcome to Print Sum of Positive Integers.\n");
        Scanner input=new Scanner(System.in);

        System.out.print("Enter number of times you want to add the numbers: ");
        int iterations=input.nextInt();

        int sum=0;
        for (int i = 0; i < iterations; i++) {
            System.out.print("Enter the number to add: ");
            int num=input.nextInt();
            if(num<0){
                continue;
            }
            sum+=num;
        }
        System.out.println("The sum of the numbers is: "+sum);
    }
}
