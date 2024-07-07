class UsingFinalKeyword {
    final int rollNum;
    final String name;
    final String doB;
    public UsingFinalKeyword(int rollNum, String name, String doB) {
        this.rollNum = rollNum;
        this.name = name;
        this.doB = doB;
    }
    @Override
    public String toString() {
        return rollNum+". "+name+"- "+doB;
    }

    public static void main(String[] args) {
        UsingFinalKeyword obj=new UsingFinalKeyword(1,"Akash","12-Dec-1994");
        System.out.println(obj.toString());
    }
}
