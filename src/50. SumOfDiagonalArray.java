class SumOfDiagonalArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of Diagonal of an Array Program");
        int[][] arr=ArrayUtility.input2dArray();
        ArrayUtility.display2dArray(arr);
        long sum=sumOfDiagonal(arr);
        System.out.println("\nThe Sum Of Diagonal Elements of the Array is: "+sum);
    }
    public static long sumOfDiagonal(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        int i=0, sum=0;
        while(i<row){
            int j=0;
            while(j<col){
                if(j==i || j==col-1-i){
                  sum=sum+arr[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
