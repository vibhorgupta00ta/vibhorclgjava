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
        this.setRoll_no(roll);
        this.setName(name);
        System.out.println("Hostel student name is "+ getName() +" his roll no. is "+ getRoll_no());
    }
}