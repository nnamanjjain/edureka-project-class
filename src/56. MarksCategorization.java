import java.util.Scanner;

class MarksCategorization {
    public static void main(String[] args) {
        System.out.println("Welcome to Student Marks Categorization\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the marks of the Student out of 100: ");
        int marks=input.nextInt();
        String result=marks>80 ? "High" : marks<50 ? "Low" : "Moderate";
        System.out.println("The Categorization of Marks is: "+result);
    }

}
