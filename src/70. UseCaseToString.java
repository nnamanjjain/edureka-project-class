class Student {
    String name;
    int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "This class name is Student and it contains:\nStudent Name: "
                +name+"\nAge: "+age;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Class\n");
        Student stu1=new Student("Anjali", 25);
        Student stu2=new Student("Narayan", 29);
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}
