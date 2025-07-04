import work1.Rectangle;
import work1.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square(5);  // subclass substitution

        rect.setHeight(10);              // Expected: height = 10
        rect.setWidth(20);               // Expected: width = 20

        int area = rect.calculateArea(); // Expected: 10 * 20 = 200
        System.out.println("Area: " + area); // Actual: 20 * 20 = 400
    }
}
