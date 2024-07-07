import java.util.Scanner;

class MonthNameSwitchCase {
    public static void main(String[] args) {
        System.out.println("Welcome to the Program to Print Months through Numbers\n");
        Scanner input= new Scanner(System.in);
        System.out.print("Please Enter the Month Number: ");
        int num=input.nextInt();

        MonthNameSwitchCase test=new MonthNameSwitchCase();
        test.printMonthName(num);
    }

    void printMonthName(int num){
        String output= switch (num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Incorrect Entry!!";
        };
        System.out.println("The Month name with number "+num+" is: "+output);
    }

}
