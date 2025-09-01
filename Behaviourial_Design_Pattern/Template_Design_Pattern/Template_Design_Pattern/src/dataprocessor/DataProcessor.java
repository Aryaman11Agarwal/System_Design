package dataprocessor;

public abstract class DataProcessor {


    public void process(){
        readData();
        processData();
        saveData();
    }

    protected abstract void readData();
    protected abstract void processData();

    protected void saveData(){
        System.out.println("Saving Data");
    }




}
