package Warehouse;


import ProductManager.Product;

import java.util.Map;
import java.util.TreeMap;

public class Warehouse {

    private int id;
    private String name;
    private String location;

    private Map<String, Product> products;

    public Warehouse(int id,String name, String location){
        this.id=id;
        this.name=name;
        this.location=location;
        products=new TreeMap<String,Product>();
    }

    public void addProduct(Product product){
        String sku=product.getSku();

        if(products.containsKey(sku)){

            System.out.println("Product already exists");
            Product existingProduct=products.get(sku);

            int quantity=existingProduct.getQuantity();

            existingProduct.setQuantity(quantity+product.getQuantity());

        }
        else{
            System.out.println("New Product added");
            products.put(sku,product);
        }

        System.out.println(product.getQuantity() + " units of product "+ product.getName()+" added successfully");
    }

    public void removeProduct(Product product){
        String sku=product.getSku();

        if(products.containsKey(sku)){
            Product existingProduct=products.get(sku);

            int quantity=existingProduct.getQuantity();

            if(quantity>=product.getQuantity()){
                existingProduct.setQuantity(quantity-product.getQuantity());

                if(existingProduct.getQuantity()==0){
                    products.remove(sku);
                }
                System.out.println(quantity+" units of "+product.getQuantity()+" removed successfully");
            }


            else{
               System.out.println("The quantity "+ product.getQuantity() +" of " +product.getName()+ " is not present");
            }
        }
        else{
            System.out.println("Product is not found in the warehouse");
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Map<String, Product> getProducts() {
        return products;
    }
}
