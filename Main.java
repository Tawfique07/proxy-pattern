public class Main {
    public static void main(String[] args) {
        OnlineRetailStoreProxy proxy = new OnlineRetailStoreProxy();

        // Add products to the online retail store through the proxy
        proxy.addProduct("123", "Product A: Description", 100);
        proxy.addProduct("456", "Product B: Description", 50);

        // Access product information and inventory through the proxy
        String productInfo = proxy.getProductInformation("123");
        int inventory = proxy.checkInventory("123");

        System.out.println("Product Information: " + productInfo);
        System.out.println("Inventory Count: " + inventory);
    }
}

