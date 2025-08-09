import java.util.ArrayList;

interface Subscriber{


    public void update();
    public String getName();
}

class EmailSubscriber implements Subscriber{

    private String name;
    EmailSubscriber(String name){
        this.name=name;
    }
    public void update() {
        System.out.println("Notifying " + name +  " through email");
    }

    @Override
    public String getName() {
        return name;
    }
}

class SMSSubscriber implements Subscriber{

    private String name;
    SMSSubscriber(String name){
       this.name=name;

    }@Override
    public void update() {
        System.out.println("Notifying " + name +  " through SMS");
    }

    @Override
    public String getName() {
      return name;
    }
}

class YoutubeSubscriber implements Subscriber{


    private String name;
    YoutubeSubscriber(String name){
      this.name=name;
    }
    @Override
    public void update() {
        System.out.println("Notifying " + name +  " through youtube");
    }

    @Override
    public String getName() {
        return name;
    }
}

class NotifierSystem{
    private ArrayList <Subscriber> subscribers;

    NotifierSystem(){
        subscribers=new ArrayList<>();

    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

      public void addVideo(String video){
          System.out.println("Video added");
          notifyAllSubscribers();
      }

      public void notifyAllSubscribers(){
        for(Subscriber subscriber: subscribers)
            subscriber.update();
      }




}


public class Main {
    public static void main(String[] args) {

        NotifierSystem notifierSystem=new NotifierSystem();

        EmailSubscriber AliceEmail=new EmailSubscriber("Alice");
        SMSSubscriber AliceSMS = new SMSSubscriber("Alice");
        SMSSubscriber Bob =new SMSSubscriber("Bob");
        notifierSystem.addSubscriber(AliceEmail);
        notifierSystem.addSubscriber(Bob);
        notifierSystem.addSubscriber(AliceSMS);

        notifierSystem.addVideo("10011001");



    }
}