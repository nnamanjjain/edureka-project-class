import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Prime Number Detection Program:");
        System.out.print("\nPlease Enter the number: ");
        int num=input.nextInt();
        boolean isPrime=isPrime(num);
        if(isPrime){
            System.out.println("The Number is a Prime Number.");
        }else{
            System.out.println("It's not a Prime Number.");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
