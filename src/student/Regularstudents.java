package student;

public class Regularstudents extends student {
    int attendance_percentage;
    String class_room;
    int age;
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
    public void search(String name, int roll, int age){
        this.Name=name;
        this.roll_no=roll;
        this.age=age;
        System.out.println("regular students search name is "+Name+" its Roll no is "+roll_no+" age is "+age);
    }
}