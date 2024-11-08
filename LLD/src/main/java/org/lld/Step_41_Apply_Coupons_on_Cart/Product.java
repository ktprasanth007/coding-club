package main.java.org.lld.Step_41_Apply_Coupons_on_Cart;

public abstract class Product {
    String name;
    double originalPrice;
    ProductType type;
    public Product(String name, double price, ProductType type){
        this.name = name;
        this.originalPrice = price;
        this.type = type;
    }

    public Product(){}
    public abstract double getPrice();
    public ProductType getType() {
        return type;
    }
}
