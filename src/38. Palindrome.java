import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to PALINDROME Program:");
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease Enter the Number: ");
        int num=input.nextInt();

        boolean isPalindrome=PalindromeNum(num);
        if(isPalindrome){
            System.out.println("The Number is Palindrome.");
        }else{
            System.out.println("It's NOT a Palindrome Number.");
        }
    }
    public static boolean PalindromeNum(int num){
        int result= DigitsReverse(num);
        return result==num;
    }

    public static int DigitsReverse(int num){
        int newNum=0;
        while(true){
            newNum+=(num%10);
            num/=10;
            if(num==0){
                return newNum;
            }
            newNum*=10;
        }
    }
}
