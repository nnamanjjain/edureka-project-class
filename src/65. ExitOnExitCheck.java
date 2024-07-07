import java.util.Scanner;

class ExitOnExitCheck {
    public static void main(String[] args) {
        System.out.println("Welcome, if you type \"EXIT\",you will be exit out.\n ");
        Scanner input=new Scanner(System.in);
        String str;

        do{
            System.out.print("Please Enter any word: ");
            str=input.next();
            if(str.equalsIgnoreCase("exit")){
                System.out.println("You are exited out of loop.");
                break;
            }
        }while(true);
    }
}
