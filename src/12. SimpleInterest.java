import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome, We are here to Calculate Simple Interest on your Money!");

        System.out.print("\nPlease Enter the Principle Amount to have: ");
        float principle=input.nextFloat();
        System.out.print("Now, Enter the rate of interest (in %): ");
        float rate=input.nextFloat();
        System.out.print("Please Enter the time (in yrs): ");
        float time=input.nextFloat();

        double SI=(principle*rate*time)/100;

        System.out.println("\nYour Simple Interest on Principle Rs."+principle+" at rate "+rate+"% for time "+time+" yrs is Rs.:"+SI);
        System.out.println("\nThanks for coming...!");
    }
}
