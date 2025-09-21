package InventoryObserver.ConcreteObserver;

import InventoryObserver.Observer;
import ProductManager.Product;
import Warehouse.Warehouse;

public class EmailObserver implements Observer {

    private String name;
    private String email;

    public EmailObserver(String name,String email){
        this.name=name;
        this.email=email;
    }

    @Override
    public void update(Product product, Warehouse warehouse) {
        if(product.getQuantity()<10){
            System.out.println("Notifying observer "+ name+" through email: "+ email+" about low stocks of product "+ product.getName()+" in the warehouse: "+ warehouse.getName()  );
        }
    }
}
