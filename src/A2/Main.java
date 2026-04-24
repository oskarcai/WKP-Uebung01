package A2;

public class Main {
    public static void main(String[] args) {




    }

    public static boolean atLeast4000Seconds(TimeUnit unit) {
        return unit.getSeconds() >= 4000;
    }
    public static boolean atLeastSeconds(int seconds, TimeUnit unit) {
        return unit.getSeconds() >= seconds;
    }
    public static boolean atLeastSeconds(int amount, char c, TimeUnit unit) {
        switch(c) {
            case 's':
                return unit.getSeconds() >= amount;
                // ganz interessant -> break; brauchen wir nicht, da return sowieso die Methode abbricht
            case 'm':
                return unit.getSeconds() >= amount*60;
            case 'h':
                return unit.getSeconds() >= amount*60*60;
            default:
                System.out.println("wird eh niemals erreicht werden");
        }
        return false;   // wird auch niemals erreicht werden
    }
}
