import java.util.Scanner;

class PrintEvensOnly {
    public static void main(String[] args) {
        System.out.println("Welcome to Print Even numbers only.\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number up to which you required to Print series: ");
        int num=input.nextInt();
        printEvenNumbers(num);
    }
    public static void printEvenNumbers(int num){
        System.out.println("\nThe series of Even Numbers up to "+num+" is:");
        for (int i = 0; i <=num ; i++) {
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
