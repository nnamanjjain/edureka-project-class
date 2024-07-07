import java.util.Scanner;

class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Add Two Numbers Program");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the First Number: ");
        int num1=input.nextInt();
        System.out.print("Now, Please Enter the second number: ");
        int num2=input.nextInt();
        System.out.println("The Addition of the numbers is: "+(num1+num2));
        System.out.println("\nThanks for Participating");
    }
}
