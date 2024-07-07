
class PalindromeArr {
    public static void main(String[] args) {
        System.out.println("Welcome to check Palindrome Array:");
        int[] arr=ArrayUtility.printArray();
        System.out.print("\nThe Entered Array:");
        ArrayUtility.displayArray(arr);
        boolean isPalindromeArr=isPalindromeArr(arr);
        if(isPalindromeArr){
            System.out.println("\nThe Entered Array is Palindrome.");
        }else{
            System.out.println("\n It's NOT Palindrome.");
        }

    }
    public static boolean isPalindromeArr(int[] arr){
        int i=0; // 1 2 3 2 1
        while(i<arr.length/2){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
