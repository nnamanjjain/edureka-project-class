import java.util.Scanner;

class GradingSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Grading system by Percentage of MArks Program::");
        System.out.print("\nEnter the Marks (in %): ");
        float num=input.nextFloat();

        if(num>90){
            System.out.println("Great Work!, You Ace the Exam and got A Grade");
        }else if(num>75){
            System.out.println("Good!, You have got Grade B.");
        }else if(num>60){
            System.out.println("Work Hard Next time!, You have passed and got Grade C.");
        }else if(num>30){
            System.out.println("Need to work on yourself!, You have just passed and got Grade D.");
        }else{
            System.out.println("Sorry!, You have Failed the Exam and got D, Try Harder next time!!");
        }
    }
}
