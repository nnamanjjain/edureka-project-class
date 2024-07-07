import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the SWAP numbers Program");
        System.out.print("\nPlease Enter the First number: ");
        int num1=input.nextInt();
        System.out.print("Now, Enter the Second Number: ");
        int num2=input.nextInt();

        int swap=num1;
        num1=num2;
        num2=swap;

        System.out.println("\nThe numbers are swapped now:");
        System.out.println("First Number is now: "+num1);
        System.out.println("Second number is :" +num2);
        System.out.println("\nThanks for Joining");

    }
}
