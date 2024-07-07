import java.util.Scanner;

class MinTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Problem to Find Minimum of Two Numbers\n");
        Scanner input= new Scanner(System.in);
        System.out.print("Please Enter first Number: ");
        int num1=input.nextInt();
        System.out.print("Please Enter second Number: ");
        int num2=input.nextInt();

        int result= num1<=num2 ? num1 : num2;
        System.out.println("The minimum of ther two numbers is: "+result);
    }
}
