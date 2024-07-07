import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to check Palindrome Number using Recursion\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number to check: ");
        String numStr=input.next();
        boolean isPalindrome=isPalindromeRecursion(numStr);
        if(isPalindrome){
            System.out.println("The number "+numStr+" is Palindrome.");
        }else{
            System.out.println("NOT a Palindrome number.");
        }
    }
    public static boolean isPalindromeRecursion(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos=str.length()-1;
        if (str.charAt(0)!=str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindromeRecursion(newStr);
    }
}
