package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ImageComponent extends JComponent{
	Image img;
	ImageComponent(String imageUrl){
		img = Toolkit.getDefaultToolkit().getImage(imageUrl);
		repaint();
	}
	public void setImage(String imageUrl){
		img = Toolkit.getDefaultToolkit().getImage(imageUrl);
		repaint();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img,0,0, this.getWidth() , this.getHeight() , Color.BLACK , this);
	}
}
