package lab7;
import javax.swing.*;
import java.awt.*;
class AllShapes extends JFrame{
	AllShapes(){
		super("All Shapes");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(328,583);
	}
	public static void main(String[] args){
		new AllShapes();
	}
	public void paint(Graphics g){
		super.paint(g);
// LINE
		g.drawLine(100, 20, 200, 100);
//RECTANGULAR
		g.drawRect(5, 150, 150, 100);
// ROUND RECTANGULAR
		g.drawRoundRect(165, 150, 150, 100, 15, 15);
// SQUARE
		g.drawRect(5, 295, 100, 100);
// ROUND SQUARE
		g.drawRoundRect(165, 295, 100, 100, 15, 15);
// OVAL
		g.drawOval(5, 440, 150, 100);
// CIRCLE
		g.drawOval(165, 440, 100, 100);
// Polygon
		//g.drawRoundRect(115, 440, 100, 100, 15, 15);
		g.drawString("Line", 120, 15); //LINE STRING
		g.drawString("Rectangular", 10, 140); //Rect
		g.drawString("Round Rectangular", 180, 140); //RoundRect
		g.drawString("Square", 10, 285); //Square
		g.drawString("Round Square", 180, 285); //RoundSqurae
		g.drawString("Oval", 10, 430); //Oval
		g.drawString("Circle", 180, 430); //Circle
		setTitle(getWidth() + " " + getHeight());
	}
}