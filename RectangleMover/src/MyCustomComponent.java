/**
 * A code stub/template for a simple GUI
 * - This file has the component which will
 *   contain the graphics.
 * 
 * @author Justin Jang
 * @version 11/25/2019
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Rectangle;

public class MyCustomComponent extends JComponent
{
    // Make instance variable(s) to hold references to
    // any objects you need to refer to.
    private Rectangle r;
    // Overload the constructor to pass reference(s) to 
    // any objects that you need to refer to.
    public MyCustomComponent(Rectangle newRect)
    {
        r = newRect;
    }
    
    
    public void paintComponent(Graphics g)
    {
        // Use this method to draw whatever you want
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        //g.drawOval(100, 100, 50, 80);
        g.drawRect((int)r.getX(),(int)r.getY(),(int) r.getWidth(),(int) r.getHeight());
    }
        
}
