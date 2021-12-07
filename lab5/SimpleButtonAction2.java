package lab5;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SimpleButtonAction2 extends JFrame{
	JButton butt1 = new JButton("Click me");
	JLabel label = new JLabel("I can guess how many times you clicked :>)");
	int count = 0;
	public SimpleButtonAction2(){
		super("My Application");
		add(butt1);
		add(label);
		setSize(200,200);
		setLayout(new FlowLayout());
		setVisible(true);
		butt1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae){
						count++;
						label.setText("Button was clicked "+count+" Times");
					}
				});
	}
	public static void main(String[] args){
		new SimpleButtonAction2();
	}
}// end of SimpleButtonAction class
