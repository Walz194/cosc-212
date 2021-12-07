package lab6;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class TextAreaExample extends JFrame{
	//JTextArea jta1 = new JTextArea(10,25);
	JButton button = new JButton("Add some Text");
	JTextArea txtArea = new JTextArea(20,20);
	JScrollPane Scroll = new JScrollPane(txtArea);
	
	public TextAreaExample(){
		super("Example");
		setSize(300,300);
		setLayout(new FlowLayout());
		//add(jta1);
		add(Scroll);
		add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String txt = JOptionPane.showInputDialog(null,"Insert some text");
				txtArea.append(txt);
			}
		});
		
		setVisible(true);
	}
	public static void main(String[]args){
		new TextAreaExample().setVisible(true);
	}

}
