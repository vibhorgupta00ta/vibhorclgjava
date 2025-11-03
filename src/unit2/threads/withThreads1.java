package unit2.threads;

class MyTask extends Thread {
    private String task_name;

    MyTask(String task_name) {
        this.task_name = task_name;
    }

    @Override
    public void run() {
        System.out.println(task_name + " is started....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Required since sleep() throws checked exception
            // But if you really want *no try-catch*, you can't use sleep safely
        }
        System.out.println(task_name + " is finished....");
    }
}

public class withThreads1 {
    public static void main(String[] args) throws InterruptedException {
        long start_time = System.currentTimeMillis();

        MyTask t1 = new MyTask("data collecting");
        MyTask t2 = new MyTask("data processing");
        MyTask t3 = new MyTask("computing");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        long end_time = System.currentTimeMillis();
        System.out.println("The diff is " + (end_time - start_time));
    }
}
