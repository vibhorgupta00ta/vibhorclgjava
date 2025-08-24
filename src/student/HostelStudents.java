package student;

public class HostelStudents extends Regularstudents{
    String hostel_name;
    int room_no;
    public HostelStudents(String Name,String Department,int RollNo,int age,int attendance_per,String class_room,String hostel_name,int room_no) {
        super(Name,Department,RollNo,age,attendance_per,class_room);
        this.hostel_name=hostel_name;
        this.room_no=room_no;
    }
    public void search(String name,int roll){
        this.Name=name;
        this.roll_no=roll;
        System.out.println("Student name from the hostel is "+Name+" it's roll no. is "+roll_no);
    }
}