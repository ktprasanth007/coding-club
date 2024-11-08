package main.java.org.lld.Step_41_Apply_Coupons_on_Cart;

public class Main {
    public static void main(String[] args) {

        Product item1 = new Item1("Fan", 1000, ProductType.ELECTRONIC);
        Product item2 = new Item2("Sofa", 2000, ProductType.FURNITURE);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(item1);
        shoppingCart.addToCart(item2);
        System.out.println("Total price after discount : " + shoppingCart.getTotalPrice());
    }
}
