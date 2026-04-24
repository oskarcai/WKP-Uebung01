package A1;

public class Main {
    public static void main(String[] args) {
        Password p1 = new Password("hallo123");
        Password p2 = new Password("halloo123");
        Password p3 = new Password("1234vier");

        int safetyCheck = p1.compareTo(p3.getValue());
        System.out.println(safetyCheck);

    }
}
