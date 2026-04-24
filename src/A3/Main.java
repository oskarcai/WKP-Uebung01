package A3;

public class Main {
    public static void main(String[] args) {
        Shape circle = createShape('c', 2.0, 0);
        Shape rectangle = createShape('r', 3.0, 4.0);

        double areaCircle = circle.getArea();
        double areaRectangle = rectangle.getArea();

        System.out.println("Kreisfläche: " + areaCircle);
        System.out.println("Rechteckfläche: " + areaRectangle);
    }

    public static Shape createShape(char type, double a, double b) {
        switch(type) {
            case 'c':
                return new Circle(a);
                // auch hier wieder interessant -> kein break; da return sowieso Methode abbricht
            case 'r':
                return new Rectangle(a,b);
            default: return null;
        }
    }
}
