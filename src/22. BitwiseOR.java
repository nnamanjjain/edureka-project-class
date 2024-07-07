import java.util.Scanner;

class BitwiseOR {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to program Bitwise OR Operation:");
        System.out.print("\nPlease Enter the first number: ");
        int first=input.nextInt();
        System.out.print("\nPlease Enter the second number: ");
        int second=input.nextInt();

        int result=first | second;

        System.out.println("The result of Bitwise OR operation is: "+result);
        System.out.println("\nThanks!!");
    }
}
