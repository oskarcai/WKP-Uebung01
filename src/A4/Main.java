package A4;

public class Main {
    public static void main(String[] args) {
        Book buch = new Book(50);
        Electronic electronic = new Electronic(100);

        System.out.println("Buchpreis (original): " + buch.getPrice());
        System.out.println("Buchpreis (discount): " + buch.getDiscountPrice());

        System.out.println("Elektronikpreis (original): " + electronic.getPrice());
        System.out.println("Elektronikpreis (discount): " + electronic.getDiscountPrice());
    }
}
