import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("---Welcome to the program to find Odd/Even---");

        System.out.print("Please enter any number: ");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println("\nThe number entered is Even.");
        }else{
            System.out.println("The number entered is Odd.");
        }
    }
}
