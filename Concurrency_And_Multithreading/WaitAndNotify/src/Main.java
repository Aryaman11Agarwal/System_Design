import java.util.LinkedList;
import java.util.Queue;

class Buffer{


    public static int capacity=5;
    public final Queue<Integer> q;

    Buffer(){
        q=new LinkedList<>();
    }

    public synchronized void produce(int value) throws Exception{

        while(q.size()==capacity) wait();


        q.add(value);
        System.out.println("Added element :" + value);
        notify();




    }

     public synchronized int consume () throws Exception{

        while(q.isEmpty()) wait();

        int x=q.peek();
        q.poll();

        if(x!=-1)

         System.out.println("Consumed element: "+x);
        else{
            System.out.println("Consumer thread ended");
        }

         notify();

         return x;
     }

}

public class Main {
    public static void main(String[] args) {

        Buffer b=new Buffer();


        Thread t1=new Thread(()->{

            int i=0;
            try {
                while (i < 10) {

                    b.produce(i++);


                }

                b.produce(-1);

                System.out.println("Producer thread ended");

            }
            catch(Exception e){
                e.printStackTrace();
            }
        });


        Thread t2=new Thread(()->{



            while(true){
                try{
                   int x= b.consume();

                   if(x==-1) break;
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}