import java.awt.Point;
/**
 *
 * @author Victoria
 */
public class Rectangle {
	private Point topLeft; //this = instance variables
	private Point bottomRight;

	public Rectangle(Point topL, Point bottomR)
	{
		this.topLeft = topL;
		this.bottomRight = bottomR;
	}
        
        public Point getTopLeft()
        {
            return topLeft;
        }
        
        public Point getBottomRight()
        {
            return bottomRight;
        }
        
	public Rectangle intersection(Rectangle r2)
	{
/*		this.topLeft.x //this = r1
		this.bottomRight.y 
		// use .equals if comparing 2 objects, and use == if comparing two things ex. int, boolean, char
		if(this.topLeft.equals(r2.topLeft)
			&& this.bottomRight.equals(r2.bottomRight))
		return new Rectangle(this.topLeft, this.bottomRight); */
		
                int x1 = this.topLeft.x;
                int x2 = this.bottomRight.x;
                int x3 = r2.topLeft.x;
                int x4 = r2.bottomRight.x;
                
                int y1 = this.topLeft.y;
                int y2 = this.bottomRight.y;
                int y3 = r2.topLeft.y;
                int y4 = r2.bottomRight.y;   

		Point noTopLeft = new Point(0, 0);
                Point noBottomRight = new Point(0, 0);            
            
		if(((x3 > x2) && (y3 > y2)) || ((x3 > x2) && (y3 < y2)) || ((x2 > x3) && (y3 < y2)) || ((x1 < x4) && (y1 < y4)) || ((x1 > x4) && (y1 > y4)) || ((x1 > x4) && (y1 < y4)) || ((x1 > x4) && (y1 > y4)))
		{
			return new Rectangle(noTopLeft, noBottomRight);
		}

		else
		{
			int topLeftX = (int) Math.max(x1, x3);
			int bottomRightX = (int) Math.min(x4, x2);
			int topLeftY = (int) Math.min(y1, y3);
			int bottomRightY = (int) Math.max(y2, y4);
         
                	Point maxTopLeft = new Point(topLeftX, topLeftY);
                	Point maxBottomRight = new Point(bottomRightX, bottomRightY);
                
                	return new Rectangle(maxTopLeft, maxBottomRight);
		}
	}    
}
