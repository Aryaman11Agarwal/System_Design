

class MyRunnable implements Runnable{
    public static int cnt=0;

    String name;
    int time;

    MyRunnable(String name,int time){
        this.name=name;
        this.time=time;
    }

    @Override
    public void run() {
        for(int i=0;i<1000000;i++){
//            int timer=MyRunnable.cnt;
//            timer+=1;
//            try{
//                Thread.sleep(1);
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }

       //     MyRunnable.cnt=timer;
            MyRunnable.cnt++;

            //System.out.println(name+" value of count is "+MyRunnable.cnt);

        }
    }
}
public class Main {
    public static void main(String[] args) {

       Thread t1=new Thread(new MyRunnable("Thread1",1000));
        Thread t2=new Thread(new MyRunnable("Thread2",2000));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }

        catch (Exception e){
            e.printStackTrace();
        }
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores: "+cores);
        System.out.println("Expected: "+ 200000+" \n Actual : "+MyRunnable.cnt);

    }
}