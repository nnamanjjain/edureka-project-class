import java.util.Scanner;

class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Guess the number Game where " +
                "you opponent is Computer itself\n");
        System.out.print("Hey!! Whats your name?..Please write here: ");
        String name=input.next();
        System.out.print("\nYou only have 5 chances "+name+"!!...So Lets Play!!\n");
        guessTheNumber(name);
    }
    public static void guessTheNumber(String name){
        Scanner input=new Scanner(System.in);
        int user;
        int system=(int)(10*Math.random());
        for (int i = 5; i >0; i--) {
            System.out.print("\nPlease Guess any number between 1 to 10: ");
            user=input.nextInt();
            if(user==system){
                System.out.println("Hey!!"+name+" Congrats!! Your guess is right..." +
                        "You have defeated the system and you deserve a prize" +
                        "\nPlease collect your prize from counter.\n");
                break;
            }else if(i>1){
                System.out.println("Keep Guessing!!...You still have "+(i-1)+" chances.");
            }else{
                System.out.println("Sry!! Your chances are Over..Better luck next time!!");
            }
        }
        System.out.println("\nThanks for Playing the Game!! Hope you Enjoyed it!!");
    }
}
