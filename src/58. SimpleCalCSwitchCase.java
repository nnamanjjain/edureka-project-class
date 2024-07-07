import java.util.Scanner;

class SimpleCalCSwitchCase {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator\n");
        Scanner input= new Scanner(System.in);
        System.out.print("Please Enter the First number: ");
        float num1=input.nextFloat();
        System.out.print("Please Enter the Second number: ");
        float num2=input.nextFloat();
        System.out.println("Please Enter the Feature you want to use from below List:");
        System.out.println("1. Add\n2. Subt\n3. Multiply\n4. Divide\n5. Mod");
        String feature=input.next();

        useCalculator(feature, num1, num2);
    }

    public static void useCalculator(String feature, float num1, float num2){
        double output= switch (feature){
            case "Add" -> num1+num2;
            case "Subt" -> num1-num2;
            case "Multiply" -> num1*num2;
            case "Divide" -> num1/num2;
            case "Mod" -> num1%num2;
            default -> -326548;
        };
        System.out.println("The Output is: "+output);
    }
}
