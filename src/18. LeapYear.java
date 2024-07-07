import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the program to determine leap year:");
        System.out.print("\nEnter the Year to check: ");
        int year=input.nextInt();

        if(year%400==0){
            System.out.println("Yeh!, This year is a leap year.");
        }else if(year%4!=0 || year%100==0){
            System.out.println("OOh!, It's not a leap year.");
        }else{
            System.out.println("This is a leap Year.");
        }
        System.out.println("Thanks!!!");
    }
}
