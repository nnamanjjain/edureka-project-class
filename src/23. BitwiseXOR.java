import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Bitwise XOR Operation:");
        System.out.print("\nPlease enter the first number: ");
        int first=input.nextInt();
        System.out.print("\nPlease enter the second number: ");
        int second=input.nextInt();

        int result= first^second;

        System.out.println("The result of Bitwise XOR operation is: "+result);
        System.out.println("\nThanks!!");
    }
}
