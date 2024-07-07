import java.util.Scanner;

class PrimeNumberFor {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Number Detector\n");
        System.out.print("Enter the number you want to check: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        boolean isPrime=isPrimeForLoop(num);
        if(isPrime){
            System.out.println("The number "+num+" is a Prime Number.");
        }else{
            System.out.println("The number "+num+" is NOT a Prime Number.");
        }
    }
    public static boolean isPrimeForLoop(int num) {
        for (int i = 2; i <= num/2; i++) { // num/2 bcz check required till num/2
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
