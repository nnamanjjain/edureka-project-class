import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to Program which Add Sum of Digits:");
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease enter the number: ");
        int num=input.nextInt();

        int result=SumOfNumber(num);
        System.out.println("The Sum Of Digits is: "+result);
        System.out.println("\nBye!!");
    }
    public static int SumOfNumber(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}
