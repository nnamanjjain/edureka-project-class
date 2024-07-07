import java.util.Scanner;

class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Bitwise ODD EVEN Program:");
        System.out.print("\nPlease enter any number: ");
        int num=input.nextInt();

        if((num&1)==0){
            System.out.println("The number entered is EVEN");
        }else{
            System.out.println("The number is ODD");
        }

        System.out.println("\nThanks!!");

    }
}
