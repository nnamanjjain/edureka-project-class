import java.util.Scanner;

class StringConcatAndConvert {
    public static void main(String[] args) {
        System.out.println("Welcome to String Concatenate and Conversion\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter the First String: ");
        String str1=input.next();
        System.out.print("Please Enter the Second String: ");
        String str2=input.next();
        String str3=str1+str2;
        System.out.print("The String After Concatenate is: "+str3);

        str3=str3.toUpperCase();
        System.out.print("\nThe String in Upper Case is: "+str3);

    }
}
