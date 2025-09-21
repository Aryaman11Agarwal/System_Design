package InventoryManager;

import InventoryObserver.Observer;
import ProductManager.Product;
import Warehouse.Warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class InventoryManager {

    private static  InventoryManager inventoryManager=null;

    private ArrayList<Observer> observers;
    int idptr=0;
    Map<Integer,Warehouse>  warehouses;
    private InventoryManager(){
        warehouses=new HashMap<Integer, Warehouse>();
        observers=new ArrayList<>();
    }

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

    public void addWarehouse(Warehouse warehouse){



         warehouses.put(warehouse.getId(),warehouse);

         System.out.println("New warehouse "+warehouse.getName()+ " created at location "+warehouse.getLocation()+ " with ID:" + warehouse.getId());



    }

    public void removeWarehouse(int id){

        if(warehouses.containsKey(id)){


            warehouses.remove(id);

            System.out.println("Warehouse with id :" + id+ " removed successfully ");

        }
        else{
            System.out.println("This ID warehouse does not exist does not exist");
        }
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(Product product,Warehouse warehouse){

        for(Observer observer:observers){
            observer.update(product,warehouse);
        }
    }

    public void checkAndNotify(){

       for(Integer key: warehouses.keySet()){
           Warehouse warehouse=warehouses.get(key);
           Map<String, Product> products=warehouse.getProducts();


           for(String productKey:products.keySet()){

               notifyObservers(products.get(productKey),warehouse);
           }
       }
    }








}
