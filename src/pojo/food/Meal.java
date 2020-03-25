package pojo.food;

public class Meal {
    private enum Segment {
        MAIN_MEAL,
        SIDE_PLATES,
        APPETIZERS,
        SALADS,
        DRINKS;
    }

    private float price;
    private int quantity;
    private Segment segment;

    public Meal(float price, Segment segment, int quantity) {
        setPrice(price);
        setQuantity(quantity);
        setSegment(segment);
    }

    public Meal(float price, Segment segment) {
        this(price, segment, 1);
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

    public void decreaseBy(int quantity) {
        if (quantity > 0)
            this.quantity = Math.max(0, this.quantity - quantity);
    }

    public void increaseBy(int quantity) {
        if (quantity > 0)
            this.quantity += quantity;
    }

    public float getTotalPrice() {
        return price * quantity;
    }

    public float getPrice() {
        return price;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }
}
