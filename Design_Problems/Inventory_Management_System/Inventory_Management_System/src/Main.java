import CommonEnums.Category;
import InventoryManager.InventoryManager;
import InventoryObserver.ConcreteObserver.EmailObserver;
import InventoryObserver.ConcreteObserver.SMSObserver;
import InventoryObserver.Observer;
import ProductFactory.ProductFactory;
import ProductManager.Product;
import Warehouse.Warehouse;

public class Main {
    public static void main(String[] args) {

        InventoryManager inventoryManager=InventoryManager.getInstance();

        Warehouse warehouse1=new Warehouse(1,"Hyderabad Warehouse", "Hyderabad");
        Warehouse warehouse2=new Warehouse(2,"Bangalore Warehouse", "Bangalore");

        inventoryManager.addWarehouse(warehouse1);
        inventoryManager.addWarehouse(warehouse2);

        ProductFactory productFactory=new ProductFactory();

        Product tv=productFactory.getProduct("1234", Category.ELECTRONICS,25000,"TV",9);
        Product jeans=productFactory.getProduct("2345",Category.CLOTHING,2000,"JEANS",1);
        Product tshirt=productFactory.getProduct("2346",Category.CLOTHING,1200,"tshirt",2);

        warehouse1.addProduct(tv);
        warehouse2.addProduct(jeans);
        warehouse1.addProduct(tshirt);

        Product jeans2=productFactory.getProduct("2345",Category.CLOTHING,2000,"JEANS",4);

        warehouse2.addProduct(jeans2);

        Observer observer1=new EmailObserver("Aryaman", "aryaman1110@gmail.com");
        Observer observer2=new SMSObserver("Aryaman","9927038266");

        inventoryManager.addObserver(observer1);
        inventoryManager.addObserver(observer2);

        inventoryManager.checkAndNotify();

    }
}