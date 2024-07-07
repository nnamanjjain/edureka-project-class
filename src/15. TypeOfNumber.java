import java.util.Scanner;

class TypeOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("This Program is to found nature/type of Number---");
        System.out.print("\nPlease Enter any number: ");
        float num=input.nextFloat();

        if(num>0){
            System.out.println("\nThe Number entered is Positive.");
        }else if(num<0){
            System.out.println("The Number Entered is Negative.");
        }else{
            System.out.println("The is Number Entered is 0.");
        }

        System.out.println("\n Thanks for coming!!");
    }
}
