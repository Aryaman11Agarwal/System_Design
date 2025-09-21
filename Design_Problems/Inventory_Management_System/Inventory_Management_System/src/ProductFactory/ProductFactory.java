package ProductFactory;

import CommonEnums.Category;
import ProductManager.ConcreteProducts.ClothingProduct;
import ProductManager.ConcreteProducts.ElectronicsProduct;
import ProductManager.ConcreteProducts.GroceryProduct;
import ProductManager.Product;

import java.util.Scanner;

public class ProductFactory {

    Scanner sc;

    public ProductFactory(){
        sc=new Scanner(System.in);
    }


    public  Product getProduct(String sku, Category category , int price, String name,int quantity){

        switch (category){
            case ELECTRONICS:{
                System.out.println("Enter the warrany period of the electronics product");
                int warranty=sc.nextInt();

                return new ElectronicsProduct.
                        Builder().
                        setName(name).
                        setSku(sku).
                        setPrice(price).
                        setQuantity(quantity).
                        setWarranty(warranty).
                        build();

            }
            case CLOTHING:{
                return new ClothingProduct.
                        Builder().
                        setName(name).
                        setPrice(price).
                        setSku(sku).
                        setQuantity(quantity).
                        build();
            }

            case GROCERY:{

                System.out.println("Enter the expiry date of the grocery product");
                String  expiryDate=sc.nextLine();
                return new GroceryProduct.Builder().
                        setName(name).setPrice(price).
                        setName(name).
                        setExpiryDate(expiryDate).
                        setQuantity(quantity).
                        build();
            }

            default:{
                throw new IllegalArgumentException(
                        "Unsupported product category: " + category);

            }



        }
    }
}
