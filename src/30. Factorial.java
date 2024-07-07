import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to the Factorial Program:");
        Scanner input=new Scanner(System.in);

        System.out.print("\nPlease Enter a number to calculate Factorial: ");
        int num=input.nextInt();

        int result=FactOfNum(num);
        System.out.println("The Factorial of the number is: "+result);
        System.out.println("\n bye!!");
    }
    public static int FactOfNum(int num){
        if(num==1) return 1;
        if(num<=0) return 1;
        int fact=1;
        int i=2;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
