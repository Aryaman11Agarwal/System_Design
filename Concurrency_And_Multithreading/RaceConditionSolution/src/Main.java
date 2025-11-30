class MyRunnable implements Runnable{

    static int cnt;



    static{
        cnt=0;
    }



    @Override
    public  void  run() {
        for(int i=0;i<10000;i++){

           synchronized (MyRunnable.class){ //MyRunnable.class is the object of whose lock we
               // are acquiring, it has to be common accross all the instances of the threads. we can
               // use another  common object of our own to create the lock
                int t=MyRunnable.cnt;
                t+=1;
                MyRunnable.cnt=t;
            }

        }
    }
}


public class Main {
    public static void main(String[] args) {


      MyRunnable myRunnable=new MyRunnable();
      Thread t1=new Thread(myRunnable);
      Thread t2=new Thread(myRunnable);

      t1.start();
      t2.start();

      try{
          t1.join();
          t2.join();
      }
      catch (Exception e){
          e.printStackTrace();
      }

      System.out.print("Expected: 20000 \nActual: ");

        System.out.println(MyRunnable.cnt);

    }
}