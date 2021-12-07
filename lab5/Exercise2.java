package lab5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise2 extends JFrame{
	JButton R = new JButton("RED");
	JButton W = new JButton("WHITE");
	JButton B = new JButton("BLUE");
	JButton G = new JButton("GREEN");
	JLabel label = new JLabel();
	
	public Exercise2(){
		super("Color Display");
		setLayout(new FlowLayout());
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(R);
		add(W);
		add(B);
		add(G);
		add(label);
		label.setFont(new Font("Lucida Handwriting",Font.ITALIC,18) );
		Listener l1 = new Listener();
		R.addActionListener(l1);
		W.addActionListener(l1);
		B.addActionListener(l1);
		G.addActionListener(l1);
		setVisible(true);
	}
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource()==R){
				label.setText("This is RED");
				getContentPane().setBackground(Color.RED);
			}
			else if(event.getSource()==W){
				label.setText("This is WHITE");
				getContentPane().setBackground(Color.WHITE);
			}
			else if(event.getSource()==B){
				label.setText("This is BLUE");
				getContentPane().setBackground(Color.BLUE);
			}
			else {
				label.setText("This is GREEN");
				getContentPane().setBackground(Color.GREEN);
			}
		}
	}
	public static void main(String[] args){
		new Exercise2();
	}
	
}
