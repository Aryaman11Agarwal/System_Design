package ProductManager.ConcreteProducts;

import CommonEnums.Category;
import ProductManager.Product;

public class ElectronicsProduct extends Product {


    private int warranty;

    public ElectronicsProduct(String sku,String name,int quantity, int price,int warranty){
        super();
        super.setCategory(Category.ELECTRONICS);
        super.setSku(sku);
        super.setName(name);
        super.setPrice(price);
        super.setQuantity(quantity);
        this.warranty=warranty;


    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }
}
