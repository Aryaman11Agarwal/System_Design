package ProductManager.ConcreteProducts;

import CommonEnums.Category;
import ProductManager.Product;

public class ElectronicsProduct extends Product {

    private int warranty;

    // Private constructor to enforce builder usage
    private ElectronicsProduct(Builder builder) {
        super.setCategory(Category.ELECTRONICS);
        super.setSku(builder.sku);
        super.setName(builder.name);
        super.setPrice(builder.price);
        super.setQuantity(builder.quantity);
        this.warranty = builder.warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    // Static Builder class
    public static class Builder {
        private String sku;
        private String name;
        private int price;
        private int quantity;
        private int warranty;

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

        public Builder setWarranty(int warranty) {
            this.warranty = warranty;
            return this;
        }

        // Build method
        public ElectronicsProduct build() {
            return new ElectronicsProduct(this);
        }
    }
}
