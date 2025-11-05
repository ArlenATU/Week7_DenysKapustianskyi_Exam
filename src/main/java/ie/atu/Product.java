package ie.atu;

public class Product {
    private String productID;
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.productID = "unknown";
        this.name = "unknown";
        this.price = 0;
        this.quantity = 0;
    }

    public Product(String productID, String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void setProductID(String productID) {
        this.productID = productID;
    }
    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    String getProductID() {
        return productID;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product ID: " + productID + " ,Name: " + name + " ,Price: " + price + " ,Quantity: " + quantity;
    }
}


