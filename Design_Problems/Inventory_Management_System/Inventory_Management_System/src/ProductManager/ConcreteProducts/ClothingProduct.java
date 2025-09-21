package ProductManager.ConcreteProducts;

import CommonEnums.Category;
import ProductManager.Product;

public class ClothingProduct extends Product {


    public ClothingProduct(String sku,String name,int quantity, int price){
        super();
        super.setCategory(Category.CLOTHING);
        super.setSku(sku);
        super.setName(name);
        super.setPrice(price);
        super.setQuantity(quantity);


    }



}
