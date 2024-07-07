import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of Fibonacci:");
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter the number till you want to print the series: ");
        int number=input.nextInt();
        FibonacciSeries(number);
        System.out.println("\nThanks and Bye!!");
    }
    public static void FibonacciSeries(int num){
        System.out.println("The Fibonacci Series till number "+num+" is:");
        int first=0, second=1;
        if(num>0){
            System.out.print("0 1 ");
            int third=0;
            while (third<num){ // to print series till num NOT count
                third=first+second;
                if(third<=num){ //to resist to print series greater than num
                    System.out.print(third+" ");
                }
                first=second;
                second=third;
            }
        }else if(num==0){
            System.out.println("0");
        }else{
            System.out.println("Wrong Entry!!,Please enter the positive number!!");
        }
    }
}
