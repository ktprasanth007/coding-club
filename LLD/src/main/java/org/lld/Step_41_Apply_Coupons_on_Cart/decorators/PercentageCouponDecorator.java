package main.java.org.lld.Step_41_Apply_Coupons_on_Cart.decorators;

import main.java.org.lld.Step_41_Apply_Coupons_on_Cart.Product;

public class PercentageCouponDecorator extends CouponDecorator {
    Product product;
    int discountPercentage;

    public PercentageCouponDecorator(Product product, int discountPercentage) {
        this.discountPercentage = discountPercentage;
        this.product = product;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        return price - (price*discountPercentage)/100;
    }
}
