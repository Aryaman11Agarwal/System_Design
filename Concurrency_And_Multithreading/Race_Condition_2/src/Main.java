
class MyRunnable implements Runnable{


    public static int cnt=0;


    @Override
    public synchronized void run() {

        for(int i=0;i<20000;i++){

                MyRunnable.cnt++;

        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyRunnable myRunnable=new MyRunnable();
        Thread t1=new Thread(new MyRunnable());
        Thread t2=new Thread(new MyRunnable());


        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }


        System.out.println(MyRunnable.cnt);

    }
}