import java.util.Scanner;

class ReverseOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse of digits program: ");
        System.out.print("\nEnter the number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        DigitsReversal(num);

        System.out.println("\nBye!!");
    }
    public static void DigitsReversal(int num){
        int newNum=0;
        while(num>0){
            newNum=(newNum+(num%10))*10;
            num=num/10;
        }
        newNum=newNum/10; //this is used to remove additional 0 from newNum.
        System.out.println("The Number After Reversing the Digits is: "+newNum);
    }
}
