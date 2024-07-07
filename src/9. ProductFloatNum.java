import java.util.Scanner;

class ProductFloatNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Product of two floating Numbers:\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Fist number: ");
        float num1=input.nextFloat();
        System.out.print("Now, Enter second number: ");
        float num2=input.nextFloat();

        double result=num1*num2;

        System.out.println("\nThe Multiplication Result is: "+result);

        System.out.println("\n Bye! Bye!");


    }
}
