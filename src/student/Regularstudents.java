package student;

public class Regularstudents extends student {
    int attendance_percentage;
    String class_room;
    public Regularstudents(String Name,String Department,int RollNo,int age,int attendance_percentage,String class_room) {
        super(Name,Department,RollNo,age);
        this.attendance_percentage=attendance_percentage;
        this.class_room=class_room;
    }
    public Regularstudents() {

    }
    public void payFee(){
        System.out.println("Child has paid the fees");
    }
}