import java.util.Scanner;

public class ArrayUtility{
    public static int[] printArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease Enter the number of elements: ");
        int size=input.nextInt();
        int[] arr=new int[size];
        int i=0;
        while(i<arr.length){
            System.out.print("Please Enter "+(i+1)+" element: ");
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }
    public static String[] inputStringArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease Enter the number of words: ");
        int size=input.nextInt();
        String[] arr=new String[size];
        int i=0;
        while(i<arr.length){
            System.out.print("Please Enter "+(i+1)+" word and press ENTER: ");
            arr[i]=input.next();
            i++;
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        System.out.println("\nThe elements are: ");
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+ " ");
            i++;
        }
        System.out.println();
    }
    public static int[][] input2dArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter number of rows: ");
        int row=input.nextInt();
        System.out.print("Please Enter number of columns: ");
        int col=input.nextInt();
        int [][] arr=new int[row][col];
        int i=0;
        while(i<row){
            int j=0;
            while(j<col){
                System.out.print("Enter element for "+(i+1)+" Row and "+(j+1)+" Column: ");
                arr[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }
    public static void display2dArray(int[][] arr){
        System.out.println("The Array you entered is:");
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
