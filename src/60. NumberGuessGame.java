import java.util.Scanner;

class NumberGuessGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game\n");
        int number;
        do{
            System.out.print("Please guess the number between 1 and 100: ");
            number=input.nextInt();
        }while(number != 67);

        System.out.println("WoW! You have guessed the number correctly.");
    }
}
