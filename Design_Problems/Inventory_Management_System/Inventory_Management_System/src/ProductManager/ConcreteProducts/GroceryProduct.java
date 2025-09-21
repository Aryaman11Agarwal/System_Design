package ProductManager.ConcreteProducts;

import CommonEnums.Category;
import ProductManager.Product;

public class GroceryProduct extends Product {


    private String expiryDate;

    public GroceryProduct(String sku,String name,int quantity, int price,String expiryDate){
        super();
        super.setCategory(Category.GROCERY);
        super.setSku(sku);
        super.setName(name);
        super.setPrice(price);
        super.setQuantity(quantity);
        this.expiryDate=expiryDate;

    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
