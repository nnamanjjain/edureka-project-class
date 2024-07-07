import java.util.Scanner;

class PerimeterQuad {
    public static void main(String[] args) {
        System.out.println("Welcome to Perimeter of the Quadrilateral:");
        Scanner input= new Scanner(System.in);

        System.out.println("\nEnter the 4 Sides of the Quadrilateral:");
        System.out.print("Enter First side: ");
        float a= input.nextFloat();
        System.out.print("Enter Second side: ");
        float b= input.nextFloat();
        System.out.print("Enter Third side: ");
        float c= input.nextFloat();
        System.out.print("Enter Forth side: ");
        float d= input.nextFloat();

        float perimeter=a+b+c+d;
        System.out.println("\nThe Perimeter of the given Quadrilateral is: "+perimeter);

        System.out.println("\n Thanks and Bye!");
    }
}
