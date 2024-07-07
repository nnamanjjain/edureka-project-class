import java.util.Scanner;

class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Program which Print Sum of ODD numbers up to your wish:");
        System.out.print("\nPlease enter the number up to which you want to print the Sum of Odd numbers: ");
        int number=input.nextInt();

        int sum=SumOfOdd(number);

        System.out.println("\nSum of Odd numbers up to "+number+" is :"+sum);
        System.out.println("\nBye!!");
    }

    public static int SumOfOdd(int num){
        int sum=0;
        int i=1;
       while(i<=num){
//           use this:
//            if(i%2!=0){
//                sum+=i;
//            }
//            i++;
//            or use below logic:
           sum+=i;
           i+=2;
       }
        return sum;
    }

}