import dataprocessor.concrete_classes.CSVProcessor;
import dataprocessor.concrete_classes.JSONProcessor;

public class Main {
    public static void main(String[] args) {


        JSONProcessor jsonProcessor=new JSONProcessor();
        CSVProcessor csvProcessor=new CSVProcessor();


        jsonProcessor.process();
        csvProcessor.process();
        //csvProcessor.processData();
    }
}