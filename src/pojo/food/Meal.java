package pojo.food;

public class Meal {
    private float price;
    private int quantity;

    public Meal(float price, int quantity) {
        setPrice(price);
        setQuantity(quantity);
    }

    public Meal(float price) {
        this(price, 1);
    }

    public void setPrice(float price) {
        if (price > 0)
            this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
    }
    public void decreaseBy(int quantity){
        if(quantity > 0)
            this.quantity = Math.max(0,this.quantity-quantity);
    }
    public void increaseBy(int quantity){
        if (quantity > 0)
            this.quantity+=quantity;
    }
    public float getTotalPrice() {
        return price * quantity;
    }

    public float getPrice() {
        return price;
    }
}
