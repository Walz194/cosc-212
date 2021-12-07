package lab5;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SimpleButtonAction {
	
		int count1;
		int count2;
		JFrame frame = new JFrame("Example");
		JButton Butt1 = new JButton("Click moi");
		JButton Butt2 = new JButton("Click me too");
		
		public SimpleButtonAction(){
			count1 = 0;
			count2 = 0;
			
			InnerListener listener = new InnerListener();
			Butt1.addActionListener(listener);
			Butt2.addActionListener(listener);
			
			frame.setLayout(new FlowLayout());
			frame.add(Butt1);
			frame.add(Butt2);
			frame.setSize(600,400);
			frame.setVisible(true);
		}
		
		class InnerListener implements ActionListener {
			public void actionPerformed(ActionEvent Event){
				if(Event.getSource()==Butt1){
					count1++;
					JOptionPane.showMessageDialog(frame,"1st Button clicked "+count1+" times");
				}
				else{
					count2++;
					JOptionPane.showMessageDialog(frame,"2nd Button clicked "+count2+" times");
				}
					
			}
			
		}
	
	public static void main(String[] args){
		new SimpleButtonAction();
	}
}// end of SimpleButtonAction class

		
