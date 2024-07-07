
class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse Array Program:");
        int[] arr=ArrayUtility.printArray();
        System.out.print("The current array:-");
        ArrayUtility.displayArray(arr);
        revArray(arr);
        System.out.print("\nThe Reverse Array:- ");
        ArrayUtility.displayArray(arr);
    }

    public static void revArray(int[] arr){
        int i=0, temp=0;//2 5 6 8 9
        while(i<arr.length/2){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i]; //9 8 6 5 2
            arr[arr.length-1-i]=temp;
            i++;
        }
    }
}
