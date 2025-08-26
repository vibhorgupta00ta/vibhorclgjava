package student;

public class HostelStudents extends Regularstudents{
    String hostel_name;
    int room_no;
    public HostelStudents(String Name,String Department,int RollNo,int age,int attendance_per,String class_room,String hostel_name,int room_no) {
        super(Name,Department,RollNo,age,attendance_per,class_room);
        this.hostel_name=hostel_name;
        this.room_no=room_no;
    }
    public void Search(String name,int roll){
        this.roll_no=roll;
        this.Name=name;
        System.out.println("Hostel student name is "+Name+" his roll no. is "+roll_no);
    }
}