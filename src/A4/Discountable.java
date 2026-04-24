package A4;

public interface Discountable {
    double DEFAULT_DISCOUNT = 0.1;

    double getPrice();          // return den Originalpreis eines Objekts
    default double getDiscountPrice() {
        return getPrice() * (1 - DEFAULT_DISCOUNT);
    }
}
