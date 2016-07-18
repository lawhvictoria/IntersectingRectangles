import java.awt.Point;

/**
 *
 * @author Victoria
 */
public class IntersectionPrinter {

    public static void main(String[] args) {
        Point r1TopLeft = new Point(0, 3);
        Point r1BottomRight = new Point(4, 1);
        Point r2TopLeft = new Point(3, 2);
        Point r2BottomRight = new Point(7, 0);
        Rectangle r1 = new Rectangle(r1TopLeft, r1BottomRight);
        Rectangle r2 = new Rectangle(r2TopLeft, r2BottomRight);
        
        Rectangle r3 = r1.intersection(r2);
        
        System.out.println("Rectangle 1: " + r1.getTopLeft() + r1.getBottomRight());
        System.out.println("Rectangle 2: " + r2.getTopLeft() + r2.getBottomRight());
        System.out.println("Intersection Rectangle: " + r3.getTopLeft() + r3.getBottomRight());
    }
    
}
