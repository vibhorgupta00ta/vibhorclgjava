package student;

public class testStudents {
    public static void main(String[] args) {
        student s1=new student(57,"vibhor",21);
        System.out.println("The name of the student is "+s1.Name+" and his roll no is "+s1.roll_no);
        Regularstudents rs=new Regularstudents("Pranav","CS",90,19,85,"c");
        HostelStudents h1=new HostelStudents("Mayank","CSEAI",29,21,89,"C","Tagore",302);
        rs.displayInfo();
        rs.payFee();
        s1.payFee();
        h1.search("Mayank kumar",28);
        rs.search("Mayank dhingra",26,19);
    }
}