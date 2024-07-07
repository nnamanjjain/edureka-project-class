import java.util.Scanner;

class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Bitwise Compliment Operation:");
        System.out.print("\nPlease enter any number: ");
        int num=input.nextInt();


        System.out.println("The result of Bitwise Compliment is: "+~num);
        System.out.println("\nThanks!!");
    }
}
