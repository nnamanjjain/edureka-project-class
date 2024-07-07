import java.util.Scanner;

class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Bitwise Left Shift Operation:");
        System.out.print("\nPlease enter any number: ");
        int num=input.nextInt();

        int result=num<<1;


        System.out.println("The result of Bitwise Left Shift Operation is: "+result);
        System.out.println("\nThanks!!");
    }
}
