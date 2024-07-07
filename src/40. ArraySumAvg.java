class ArraySumAvg {
    public static void main(String[] args) {
        System.out.println("Welcome to SUM and Average Of an Array Program:");
        int[] arr=ArrayUtility.printArray();
        ArrayUtility.displayArray(arr);
        long sum=sumArray(arr);
        System.out.println("\nThe Sum of elements is: "+sum);
        float avg=avgArray(arr);
        System.out.println("\nThe Sum of elements is: "+avg);
    }

    public static long sumArray(int[] arr){
        long sum=0;
        int i=0;
        while(i<arr.length){
            sum+=arr[i];
            i++;
        }
        return sum;
    }

    public static float avgArray(int[] arr){
        long sum=sumArray(arr);
        return (float)sum/arr.length;
    }

}
