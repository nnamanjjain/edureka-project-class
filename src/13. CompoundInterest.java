import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the World of Compound Interest!!");
        System.out.print("\nPlease enter the principle amount (in Rs): ");
        float principle=input.nextFloat();
        System.out.print("Now Enter Rate of Interest (in %): ");
        float rate=input.nextFloat();
        System.out.print("Enter the time (in yrs): ");
        float time=input.nextFloat();

        double CI= principle*(Math.pow((1+rate/100), time));

        System.out.println("\nThe Compound Interest is Rs."+CI);
        System.out.println("\n Thanks for Joining!");

    }
}
