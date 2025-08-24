package student;

public class student {
      protected String name;
    protected String Department="cseai";
    int roll_no;
    static int age=21;
    float CGPA;
    static String collegename="Kiet";
    final String dept="AI";
    public void studying(int no_of_hours) {
        System.out.println("The Student " + name + " is studying for " + no_of_hours);
    }
    public void readandwrite() {
        System.out.println("The student can read and write");
    }
    public void displayInfo() {
        System.out.println("Student name is " + name + ", age is " + age +
                ". Roll no. is " + roll_no + " and Department is " + Department);
    }
    public student(int roll_no,String name,int age) {
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;
    }
    public student() {

    }
    public static void main(String[] args) {
        student student1 = new student(57,"Vibhor",21);
        student1.displayInfo();
        student student2 = new student(56,"Vedansh",19);
        student2.displayInfo();
        student student3=new student(19,"Shourya",20);
        student3.displayInfo();
//    	student student3=new student();
//    	//student1.name="Vibhor gupta";
//    	student1.Department="CSEAI";
//    	//student1.roll_no=57;
//    	student1.age=21;
//    	student1.displayInfo();
//    	student3.name="Shourya";
//    	student3.roll_no=19;
//    	student3.displayInfo();
//   	student2.name="Vedansh";
        System.out.println("Collegename is "+student1.collegename);
        student.collegename="ABES";
        student1.collegename="GLBAJAJ";//static hae toh sab me same changes aa jaega ek me karo toh bhi overall karo toh bhi
        System.out.println("Collegename is "+student2.collegename);
        System.out.println(student1.dept);
    }
}