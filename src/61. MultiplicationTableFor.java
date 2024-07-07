import java.util.Scanner;

class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Print the Multiplication Tables\n");
        System.out.print("Enter the number for which yo want the table: ");
        int num=input.nextInt();
        printTableForLoop(num);
    }
    public static void printTableForLoop(int num){
        System.out.println("The table for number "+num+" is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
