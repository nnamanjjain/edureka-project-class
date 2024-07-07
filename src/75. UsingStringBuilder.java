class UsingStringBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to concatenate Array into single String\n");
        String[] arr=ArrayUtility.inputStringArray();
        StringBuilder line=new StringBuilder();

        for(String value:arr){
            line.append(value).append(" ");
        }
        System.out.println("The Single String is: "+line);
    }
}
