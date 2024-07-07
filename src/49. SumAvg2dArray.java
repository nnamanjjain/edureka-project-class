class SumAvg2dArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of SUM and Average of 2D Array\n");
        int[][] arr=ArrayUtility.input2dArray();
        ArrayUtility.display2dArray(arr);

        int sum=sumOf2dArray(arr);
        float avg=avgOf2dArray(arr);

        System.out.println("Sum of 2D array is: "+sum);
        System.out.println("\nAverage of 2D array is: "+avg);
    }

    public static int sumOf2dArray(int[][] arr){
        int i=0, sum=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                sum+=arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static float avgOf2dArray(int[][] arr){
        int sum=sumOf2dArray(arr);
        return sum/(float)(arr.length*arr[0].length);
    }
}
