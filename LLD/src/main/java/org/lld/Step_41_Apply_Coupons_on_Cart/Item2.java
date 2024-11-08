package main.java.org.lld.Step_41_Apply_Coupons_on_Cart;

public class Item2 extends Product {

    Item2(String name, double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
