import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong Number Program:");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number to check: ");
        int number=input.nextInt();
        boolean isArmstrong=ArmstrongNum(number);
        if(isArmstrong){
            System.out.println("The number is a Armstrong Number.");
        }else{
            System.out.println("Its not a Armstrong Number.");
        }
    }
    public static boolean ArmstrongNum(int num){
        int numCopy=num;
        double sum=0;
        while(num>0){
            int cube= num%10;
            sum=sum+Math.pow(cube,3);
            num=num/10;
        }
        return sum==numCopy;
    }
}
