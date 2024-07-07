class Course {
    static int maxCapacity=100;
    String courseName;
    int enrollment;
    String[] enrolledStudent;

    Course(String courseName){
        this.courseName=courseName;
        this.enrollment=0;
        this.enrolledStudent= new String[maxCapacity];
    }
    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }
    void enrollStudent(String studentName){
            enrolledStudent[enrollment]=studentName;
            enrollment++;
        }
    void unrollStudent(String studentName){
        System.out.println("Student is unrolled");
    }
}
