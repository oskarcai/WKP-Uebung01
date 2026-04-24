package A4;

public class Electronic implements Discountable {
    private double price;

    public Electronic(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    // default-Methode getDiscountPrice aus dem Interface Discountable
    // wird hier überschrieben, da wir statt dem 10% Rabatt-Standard
    // für Elektronikartikel 20% Rabatt implementieren wollen
    @Override
    public double getDiscountPrice() {
        return getPrice() * 0.8;
    }
}
