import java.util.HashMap;
import java.util.Map;


// RealSubject representing the actual online retail store
class RealOnlineRetailStore implements OnlineRetailStore {
    private Map<String, String> productInfo;
    private Map<String, Integer> inventory;

    public RealOnlineRetailStore() {
        productInfo = new HashMap<>();
        inventory = new HashMap<>();
    }

    @Override
    public String getProductInformation(String productID) {
        return productInfo.get(productID);
    }

    @Override
    public int checkInventory(String productID) {
        return inventory.getOrDefault(productID, 0);
    }

    // Method to add a product to the store
    public void addProduct(String productID, String information, int initialInventory) {
        productInfo.put(productID, information);
        inventory.put(productID, initialInventory);
    }
}