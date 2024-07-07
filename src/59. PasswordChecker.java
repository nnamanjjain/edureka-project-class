import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Valid Password Checker\n");
        String password;
        do{
            System.out.print("Please Enter the password to check: ");
            password=input.next();
        }while(!isValidPasswd(password));

        System.out.println("Congrats!..You have Enter a valid Password.");
    }

    public static boolean isValidPasswd(String password){
        return password.length()>=8;
    }
}
