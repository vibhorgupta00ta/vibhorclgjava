package exception.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

//public class ExceptionDemo1 {
//    public void divide(){
//        int a=7,b=0;
//        int c=a/b;
//    }
//    public static void main(String[] args) {
//        ExceptionDemo1 ed = new ExceptionDemo1();
//        try {
//            ed.divide();
//        }catch(ArithmeticException e){
//            System.out.println("Arithmetic Exception handled");
//        }
//        try {
//            FileReader fr = new FileReader("abc.txt");
//        }catch (FileNotFoundException e){
//            //e.printStackTrace();
//            System.out.println(e.toString());
//            //System.out.println(e.getMessage());
//        }
public class ExceptionDemo1 {
    public void divide() throws ArithmeticException, FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");
        int a=7,b=0;
        int c=a/b;
    }
public static void main(String[] args) {
    ExceptionDemo1 ed = new ExceptionDemo1();
    try {
        ed.divide();
    }catch(FileNotFoundException e) {

    }
    catch (ArithmeticException e) {

    }
        System.out.println("1");
    }
}
