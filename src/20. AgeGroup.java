import java.util.Scanner;

class AgeGroup {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Age Group of People Program::");
        System.out.print("\nPlease Enter the the age of the person (in yrs): ");
        int age=input.nextInt();

        if(age<13){
            System.out.println("Person is a Child.");
        }else if(age<20){
            System.out.println("Person is a Teenage.");
        }else if(age<60){
            System.out.println("Person is a Adult.");
        }else{
            System.out.println("Person is a Senior Citizen.");
        }
    }
}
