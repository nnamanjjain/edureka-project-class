import java.util.Scanner;

class TableMultiplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Print Table of any number Program:");
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease Enter the number for which you wish to print the Table of: ");
        int num=input.nextInt();
        Multiplication(num);
        System.out.println("Thanks and Bye!!");
    }

    public static void Multiplication(int num){
        System.out.println("\nThe table of "+num+" is:");
        int i=1;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }
    }
}
