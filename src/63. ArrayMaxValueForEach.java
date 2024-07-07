
class ArrayMaxValueForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to Max Value Check\n");
        int[] arr=ArrayUtility.printArray();

        int maxNum=maxValueArr(arr);
        System.out.println("The Maximum Value is: "+maxNum);
    }
    public static int maxValueArr(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num: arr){ // 5, 8, 63, 58, 85
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
