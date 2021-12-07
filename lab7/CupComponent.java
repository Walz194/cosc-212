package lab7;
import javax.swing.*;
import java.awt.*;
public class CupComponent extends JPanel{
		CupComponent(){

		}
public static void main(String[] args){
	
	}
public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.drawOval(20, 20, getWidth() - 60, 50);
//TOP SIDE OF THE CUP
	g.drawOval(40, getHeight() - 60, getWidth() - 120, 50); //BOTTOM
//SIDE OF THE CUP
	g.drawLine(20 , 20+ 25, 40, getHeight() - 35); //LEFT
//LINE OF THE CUP
	g.drawLine(getWidth() - 60 + 20 , 20 + 25, 40 + getWidth() - 120, getHeight() - 35);
//RIGHT LINE OF THE CUP
	}
}