import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {


        CompletableFuture<String> cf=new CompletableFuture<>();

        Thread t1=new Thread(()->{

            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }

            cf.complete("aryaman");


            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }

            System.out.println("Thread : "+ Thread.currentThread().getName()+" has exited");

        },"Aryaman thread");



        t1.start();
        try{
            System.out.println(cf.get());
        }
        catch (Exception e){
            e.printStackTrace();
        }


        //System.out.println("Main thread exited");

        CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->"Aryaman").thenApply((s)->{
                   int cnt=0;

                   for(Integer ch=0;ch<s.length();ch++) cnt++;

                   return cnt;
                }
                );

        try{
            System.out.println(cf2.get());
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}