package main.java.org.lld.Step_41_Apply_Coupons_on_Cart;

public class Item1 extends Product {

    Item1(String name, double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
