import java.util.Scanner;

class BitwiseAND {
    public static void main(String[] args) {
        System.out.println("Welcome to Bitwise AND Operator Program:");
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease enter the first number: ");
        int first=input.nextInt();
        System.out.print("\nPlease enter the second number: ");
        int second=input.nextInt();

        int result= first & second;

        System.out.println("The Result of Bitwise AND is: "+result);
        System.out.println("\n Thanks!!!");
    }
}
