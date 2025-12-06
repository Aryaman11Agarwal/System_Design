import java.util.LinkedList;
import java.util.Queue;

class Buffer{

    public final Queue<Integer> q;
    public final int capacity=5;

    public boolean isDone;


    Buffer(){
        q=new LinkedList<>();
        isDone=false;
    }

    public synchronized void produce(int value) throws Exception{

        while(q.size()==capacity) wait();

        q.add(value);

        System.out.println("Added :" + value);
        notify();
        Thread.sleep(1000);

    }
    public synchronized void setIsDone(){

        isDone=true;

        notifyAll();
    }

    public synchronized Integer consume() throws Exception{

        while(q.isEmpty() && !isDone) wait();

        if(q.isEmpty() && isDone) return null;


        int x=q.peek();
         q.poll();
        System.out.println("Thread: "+ Thread.currentThread().getName()+" removed element "+ x);

        notify();

        Thread.sleep(100);


        return x;

    }
}

public class Main {
    public static void main(String[] args) {



        Buffer b=new Buffer();

        Thread producer=new Thread(()->{
            try{
                for(int i=0;i<1000;i++){
                    b.produce(i);
                }

                b.setIsDone();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread consumer1=new Thread(()->{
            try{
              while(true){
                  Integer x=b.consume();

                  if(x==null) break;


              }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        },"Consumer-1");

        Thread consumer2=new Thread(()->{
            try{
                while(true){
                    Integer x=b.consume();

                    if(x==null) break;


                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        },"Consumer-2");

        producer.start();
        consumer1.start();
        consumer2.start();

        try{
            producer.join();
            consumer1.join();
            consumer2.join();
        }
        catch (Exception e){
           e.printStackTrace();
        }
    }
}