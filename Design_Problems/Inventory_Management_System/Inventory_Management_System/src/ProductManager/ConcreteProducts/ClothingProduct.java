package ProductManager.ConcreteProducts;

import CommonEnums.Category;
import ProductManager.Product;

public class ClothingProduct extends Product {

    // Private constructor to enforce usage of builder
    private ClothingProduct(Builder builder) {
        super.setCategory(Category.CLOTHING);
        super.setSku(builder.sku);
        super.setName(builder.name);
        super.setPrice(builder.price);
        super.setQuantity(builder.quantity);
    }

    // Static inner Builder class
    public static class Builder {
        private String sku;
        private String name;
        private int price;
        private int quantity;

        // Builder methods for setting fields
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

        // Build method returns the constructed ClothingProduct
        public ClothingProduct build() {
            return new ClothingProduct(this);
        }
    }
}
