import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        System.out.println("Welcome to find GCD Program:");
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease enter the First number: ");
        int first=input.nextInt();
        System.out.print("\nNow, Please enter the Second number: ");
        int second=input.nextInt();
        int result=GcdNum(first, second);
        System.out.println("The GCD of two Numbers are: "+result);
        System.out.println("\n Thanks!!!");
    }
    public static int GcdNum(int num1, int num2){
        int gcd =LeastOfTwo(num1, num2);
        while(gcd >0){ // also can be used while(true) and return -1 can be avoided.
            if(num1% gcd ==0 && num2% gcd ==0){
                return gcd; //always execute on matter what.
            }
            gcd--;
        }
        return -1;
    }
    public static int LeastOfTwo(int num1, int num2){
        if(num1<=num2){
            return num1;
        }else{
            return num2;
        }
    }
}
