package unit2.threads;

public class myThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("The thread1 is running....");
    }

    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        Thread th1 = new Thread(t1);
        th1.start();
    }
}
