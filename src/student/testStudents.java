package student;

public class testStudents {
    public static void main(String[] args) {
        student s1=new student(57,"vibhor",21);
        System.out.println("The name of the student is "+s1.Name+" and his roll no is "+s1.roll_no);
        Regularstudents rs=new Regularstudents("Pranav","CS",90,19,85,"c");
        HostelStudents hs=new HostelStudents("Mayank","CSE",23,21,89,"C-123","Tagore",123);
        rs.displayInfo();
        rs.payFee();
        s1.payFee();
        hs.Search("mayank",22);
        hs.Search("Mahan");
    }
}