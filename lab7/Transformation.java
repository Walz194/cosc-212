package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transformation extends JFrame{
		JButton up = new JButton("UP");
		JButton down = new JButton("DOWN");
		JButton left = new JButton("Left");
		JButton right = new JButton("Right");
		JPanel south = new JPanel();
		int xStart = 50;
		int yStart = 50;
		int width = 200;
		int height = 200;
		Transformation(){
			super("Transformation");
			setSize(400,400);
			setLayout(new BorderLayout());
			add(south,BorderLayout.SOUTH);
			south.setLayout(new FlowLayout());
			south.add(up);
			south.add(down);
			up.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					yStart--;
					repaint();
				}
			});
			down.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					yStart++;
					repaint();
				}
			});
			setVisible(true);
		}
		public void paint(Graphics g){
			super.paint(g);
			g.drawRect(xStart,yStart,width,height);
		}
		public static void main(String[]args){
			new Transformation();
		}
	}
