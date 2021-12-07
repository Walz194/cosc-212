package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RandomShapes extends JFrame{
	JButton b= new JButton("Change");;
	Color c;
	RandomShapes(){
		super("Random Shapes");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		add(b, BorderLayout.SOUTH);
		//b.setHorizontalAlignment(JButton.CENTER);
		setSize(600,400);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				repaint();
			}
		});
		setVisible(true);
	}
	public static void main(String[] args){
		new RandomShapes();
	}
	public void paint(Graphics g){
		int lineX1, lineX2, lineY1, lineY2;
		int ciX1, ciX2, ciY1, ciY2;
		super.paint(g);
		lineX1 = (int)(Math.random() * getWidth() / 4.0);
		lineY1 = (int)(Math.random() * getHeight()/ 4.0);
		lineX2 = (int)(Math.random() * getWidth());
		lineY2 = (int)(Math.random() * getHeight());
		
		ciX1 = (int)(Math.random() * getWidth() / 4.0);
		ciY1 = (int)(Math.random() * getHeight()/ 4.0);
		ciX2 = (int)(Math.random() * getWidth());
		ciY2 = (int)(Math.random() * getHeight());
		
		c = new Color( (int) (Math.random() * 255) , (int) (Math.random() * 255) , (int)(Math.random() * 255));
		g.setColor(c);
		g.fillRect( lineX1 , lineY1 , lineX2 , lineY2);
		c = new Color( (int) (Math.random() * 255) , (int) (Math.random() * 255) , (int)(Math.random() * 255));
		g.setColor(c);
		g.fillOval(ciX1, ciY1, ciX2, ciY2);	
	}
}