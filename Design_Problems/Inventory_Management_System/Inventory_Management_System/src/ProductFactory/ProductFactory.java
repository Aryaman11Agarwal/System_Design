package ProductFactory;

import CommonEnums.Category;
import ProductManager.ConcreteProducts.ClothingProduct;
import ProductManager.ConcreteProducts.ElectronicsProduct;
import ProductManager.ConcreteProducts.GroceryProduct;
import ProductManager.Product;

import java.util.Scanner;

public class ProductFactory {

    Scanner sc;

    ProductFactory(){
        sc=new Scanner(System.in);
    }


    public  Product getProduct(String sku, Category category , int price, String name,int quantity){

        switch (category){
            case ELECTRONICS:{
                System.out.println("Enter the warrany period of the electronics product");
                int warranty=sc.nextInt();

                return new ElectronicsProduct(sku,name,quantity,price,warranty);

            }
            case CLOTHING:{
                return new ClothingProduct(sku,name,quantity,price);
            }

            case GROCERY:{

                System.out.println("Enter the expiry date of the grocery product");
                String  expiryDate=sc.nextLine();
                return new GroceryProduct(sku,name,quantity,price,expiryDate);
            }

            default:{
                throw new IllegalArgumentException(
                        "Unsupported product category: " + category);

            }



        }
    }
}
