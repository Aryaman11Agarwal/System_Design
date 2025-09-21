package InventoryObserver.ConcreteObserver;

import InventoryObserver.Observer;
import ProductManager.Product;
import Warehouse.Warehouse;

public class SMSObserver implements Observer {

    private String name;
    private String phone;

    public SMSObserver(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    @Override
    public void update(Product product, Warehouse warehouse) {
        if(product.getQuantity()<10){
            System.out.println("Notifying observer "+ name+" through SMS at phone number: "+ phone +" about low stocks of product "+ product.getName()+" in the warehouse: "+ warehouse.getName() );
        }
    }
}
