import java.sql.SQLOutput;

class MyRunnable implements Runnable{

    String name;
    int time;

    MyRunnable(String name,int time){
        this.name=name;
        this.time=time;
    }

    @Override
    public void run() {
        for(int i=0;i<1;i++){


            try{
                Thread.sleep(time);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Thread :" + name+" is running at iteration number "+ i);

        }
    }
}

public class Main {
    public static void main(String[] args) {


        Thread t1=new Thread(new MyRunnable("Thread1",1000));
        Thread t2=new Thread(new MyRunnable("Thread2",20000));

        t1.start();
        t2.start();

        try{
            t1.join();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exits");

    }
}