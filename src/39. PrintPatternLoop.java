import java.util.Scanner;

class PrintPatternLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to world of Pattern");
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease Enter the number of lines of the Pattern: ");
        int num=input.nextInt();
        System.out.println("\nRight Half Pyramid:");
        RightHalfPyramid(num);//Logic: Jitna Row ka number Utne Stars
        System.out.println("\nReverse Right Half Pyramid:");
        ReverseRightHalf(num);//Logic: Jitna Row ka number Utne Stars
        System.out.println("\nLeft Half Pyramid:");
        LeftHalfPyramid(num);//Logic: Jitna Row ka number Utne Stars
        System.out.println("\n Bye!!");
    }
    public static void RightHalfPyramid(int num){
        int row=1;
        while(row<=num){
            int star=1;
            while(star<=row){
                System.out.print("* ");
                star++;
            }
            System.out.println();
            row++;
        }
    }

    public static void ReverseRightHalf(int num){
        int row=num;
        while(row>0){
            int star=1;
            while(star<=row){
                System.out.print("* ");
                star++;
            }
            System.out.println();
            row--;
        }
    }
    public static void LeftHalfPyramid(int num){
        int row=1;
        while(row<=num){
            int space=num-row;
            while(space>0){
                System.out.print("  ");
                space--;
            }
            int star=1;
            while(star<=row){
                System.out.print("* ");
                star++;
            }
            System.out.println();
            row++;
        }
    }

}
