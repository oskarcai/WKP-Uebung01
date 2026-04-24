package A4;

public class Book implements Discountable {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    // default-Methode getDiscountPrice() aus dem Interface Discountable
    // muss nicht überschrieben werden, da 10% Rabatt-Standard gilt

}
