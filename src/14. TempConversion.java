import java.util.Scanner;

class TempConversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Temperature Conversion from Fehrenite to Celsius!!");
        System.out.print("Enter the temp in Feh: ");
        float F=input.nextFloat();

        float C=((F-32)*5)/9;
        System.out.println("\nThe temperature in Degree Celsius is: "+C);

        System.out.println("\n Bye!");


    }
}
