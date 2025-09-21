package InventoryObserver;

import ProductManager.Product;
import Warehouse.Warehouse;

public interface Observer {

    public void update(Product product,  Warehouse warehouse);
}
