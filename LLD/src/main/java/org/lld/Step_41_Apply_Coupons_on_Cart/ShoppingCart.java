package main.java.org.lld.Step_41_Apply_Coupons_on_Cart;

import main.java.org.lld.Step_41_Apply_Coupons_on_Cart.decorators.PercentageCouponDecorator;
import main.java.org.lld.Step_41_Apply_Coupons_on_Cart.decorators.TypeCouponDecorator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;
    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addToCart(Product product) {

        Product productWithEligibleDiscount = new TypeCouponDecorator(
                new PercentageCouponDecorator(product, 10),3, product.getType());
        productList.add(productWithEligibleDiscount);
    }

    public int getTotalPrice() {
        int totalPrice = 8;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
