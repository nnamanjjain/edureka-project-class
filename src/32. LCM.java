import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to LCM Program:");
        System.out.print("\nPlease enter the first number to find the LCM: ");
        int first=input.nextInt();
        System.out.print("\nNow, Please enter the second number to find the LCM: ");
        int second=input.nextInt();

        int lcm=lcmNum(first, second);
        System.out.println("The LCM of the number is "+lcm);
        System.out.println("\n Bye!!");
    }
    public static int lcmNum(int num1, int num2){
        int lcm;
        int i=1;
        while(i<=num1){  // or use:'while(true)'to avoid additional 'return -1'.
            lcm=num2*i;
            if(lcm%num1==0 && lcm%num2==0){
                return lcm; //always execute on matter what.
            }
            i++;
        }
        return -1;
    }
}
