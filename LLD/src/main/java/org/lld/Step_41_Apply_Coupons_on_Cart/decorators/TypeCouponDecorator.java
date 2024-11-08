package main.java.org.lld.Step_41_Apply_Coupons_on_Cart.decorators;

import main.java.org.lld.Step_41_Apply_Coupons_on_Cart.Product;
import main.java.org.lld.Step_41_Apply_Coupons_on_Cart.ProductType;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {

    Product product;;
    int discountPercentage;
    ProductType type;
    static List<ProductType> eligibleTypes = new ArrayList<>();
    static {
        eligibleTypes.add(ProductType.FURNITURE);
        eligibleTypes.add(ProductType.ELECTRONIC);
    }

    public TypeCouponDecorator(Product product, int percentage, ProductType type) {
        this.product = product;
        this.discountPercentage = percentage;
        this.type = type;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if (eligibleTypes.contains(type)) {
            return price - (price * discountPercentage)/100;
        }
        return price;
    }
}
