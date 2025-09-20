class Logger{

    private static Logger logger=null;
    private Logger(){

    }


    public static  Logger getLogger(){

         if(logger==null){
             System.out.println("Creating logger for the first time");
             logger=new Logger();
         }
         else{
             System.out.println("Logger already exists");
         }

         return logger;
    }
}


class LoggerSynchronised{

    private static LoggerSynchronised loggerSynchronised=null;
    private LoggerSynchronised(){

    }


    public static synchronized LoggerSynchronised getLogger(){
        // this ensures that only one thread enters this function at once, but is not efficient
        //because all the threads will have to wait even after the instance is created
        if(loggerSynchronised==null){

            System.out.println("Creating Synchronised  logger for the first time");
            loggerSynchronised=new LoggerSynchronised();
        }
        else{
            System.out.println("Logger already exists");
        }

        return loggerSynchronised;
    }
}


class LoggerSynchronisedEfficient{

    private static LoggerSynchronisedEfficient loggerSynchronisedEfficient=null;
    private LoggerSynchronisedEfficient(){

    }


    public static LoggerSynchronisedEfficient getLogger(){

        if(loggerSynchronisedEfficient==null){
             synchronized (LoggerSynchronisedEfficient.class){
                 if(loggerSynchronisedEfficient==null)
                 //we check here again because two thread can cross the before check and can still create
                 // two instances sequentially, so thread B will check if some thread A has made an instance already

                     loggerSynchronisedEfficient=new LoggerSynchronisedEfficient();
             }
        }

        return loggerSynchronisedEfficient;
    }
}


public class Main {
    public static void main(String[] args) {


        Logger logger=Logger.getLogger();
        LoggerSynchronised loggerSynchronised=LoggerSynchronised.getLogger();
        LoggerSynchronisedEfficient loggerSynchronisedEfficient=LoggerSynchronisedEfficient.getLogger();



    }
}
