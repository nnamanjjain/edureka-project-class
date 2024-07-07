import java.util.Scanner;

class GreatestOf3Integer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the program to find greatest integer in 3 numbers:::");

        System.out.print("\nPlease Enter the First number:  ");
        int first=input.nextInt();
        System.out.print("\nPlease Enter the Second number:  ");
        int second=input.nextInt();
        System.out.print("\nPlease Enter the Third number:  ");
        int third=input.nextInt();

        if(first>=second && first>=third){
            System.out.println("The greatest number is: "+first);
        }else if(second>third){
            System.out.println("The greatest number is: "+second);
        }else{
            System.out.println("The greatest number is: "+third);
        }

        System.out.println("\nThanks And Bye!!");
    }
}
