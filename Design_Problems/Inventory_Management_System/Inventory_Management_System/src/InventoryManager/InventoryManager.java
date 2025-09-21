package InventoryManager;

public class InventoryManager {

    private static volatile InventoryManager inventoryManager=null;
    private InventoryManager(){}

    public static  InventoryManager getInstance(){

        if(inventoryManager==null){

            synchronized (InventoryManager.class){

                if(inventoryManager==null){
                    inventoryManager=new InventoryManager();
                }

            }

        }

        return inventoryManager;
    }




}
