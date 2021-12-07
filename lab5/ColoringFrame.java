package lab5;
import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;
public class ColoringFrame extends JFrame{
	JLabel label = new JLabel("Where do you wanna go today?");
	public ColoringFrame(){
		super("Coloring");
		getContentPane().setBackground(Color.PINK);
		setSize(500,500);
		add(label);
		label.setFont(new Font("Times New Roman", Font.BOLD, 34));
		label.setForeground(Color.WHITE);
		setVisible(true);
	}
	public static void main(String[] args){
		new ColoringFrame();
	}

}
