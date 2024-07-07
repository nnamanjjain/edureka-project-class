import java.util.Scanner;

class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Welcome to find Absolute Value Program\n");
        Scanner input= new Scanner(System.in);
        System.out.print("Please Enter any Integer Number: ");
        int num=input.nextInt();

        int absValue= num>=0 ? num : -(num);
        System.out.print("The Absolute Value of "+num+" is: "+absValue);
    }
}
