package ProductManager.ConcreteProducts;

import CommonEnums.Category;
import ProductManager.Product;

public class GroceryProduct extends Product {

    private String expiryDate;

    // Private constructor to enforce builder usage
    private GroceryProduct(Builder builder) {
        super.setCategory(Category.GROCERY);
        super.setSku(builder.sku);
        super.setName(builder.name);
        super.setPrice(builder.price);
        super.setQuantity(builder.quantity);
        this.expiryDate = builder.expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    // Static Builder class
    public static class Builder {
        private String sku;
        private String name;
        private int price;
        private int quantity;
        private String expiryDate;

        // Builder methods
        public Builder setSku(String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        // Build method
        public GroceryProduct build() {
            return new GroceryProduct(this);
        }
    }
}
