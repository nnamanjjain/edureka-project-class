import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to find Odd Even Number\n");
        Scanner input= new Scanner(System.in);
        System.out.print("Please Enter first Number: ");
        int num=input.nextInt();

        String result= num%2==0 ? "EVEN" : "ODD";
        System.out.print("The entered number "+num+" is: "+result);
    }
}
