import java.util.Scanner;

class AreaTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Area of Triangle Program:");

        System.out.print("\nEnter the Base of the Triangle: ");
        float base=input.nextFloat();
        System.out.print("Enter the Perpendicular Height of the Triangle: ");
        float height=input.nextFloat();

        float area= (base*height)/2;

        System.out.println("\nArea of the given Triangle is: "+area);
        System.out.println("\nAppreciated the work...Bye!");
    }
}
