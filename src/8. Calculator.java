import java.util.Scanner;

class Calculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME to the Calculator:");
        System.out.print("\nPlease enter the first number: ");
        int num1=input.nextInt();
        System.out.print("Now,Please enter the Second number: ");
        int num2=input.nextInt();

        System.out.println("\nThe results are:");
        int sum=num1+num2, sub=num1-num2, mod=num1%num2, mul=num1*num2, div=num1/num2;

        System.out.println("The Sum is :: "+sum);
        System.out.println("The Subtraction is:: " +sub);
        System.out.println("The Multiplication is:: "+mul);
        System.out.println("The division is :: "+div);
        System.out.println("The Remainder is:: "+mod);

        System.out.println("\nThe Calculation is Over...Thanks");

    }
}
