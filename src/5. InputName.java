import java.util.Scanner;

class InputName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Print Message Program");
        System.out.println("Please Enter your name to print the Message: ");
        String name=input.nextLine();
        System.out.println("Welcome "+name+" to the World of Java.");
    }
}
