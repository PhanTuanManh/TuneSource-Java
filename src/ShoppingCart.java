import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private int cartID;
    private int userID;
    private List<CartItem> cartItems;

    public ShoppingCart(int cartID, int userID) {
        this.cartID = cartID;
        this.userID = userID;
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(Music musicItem) {}

    public void removeFromCart(Music musicItem) {}

    public void viewCart() {}

    public void checkout() {}
}
