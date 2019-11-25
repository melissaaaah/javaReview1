/**
 * A code stub/template for a simple GUI
 * - This file has the main method, which
 *   simply creates the main window.
 * 
 * @author Justin Jang
 * @version 11/25/2019
 */

import javax.swing.JFrame;

public class MyCustomFrameViewer
{
   public static void main(String[] args)
   {
      MyCustomFrame frame = new MyCustomFrame();
      frame.setTitle("My first frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}  
