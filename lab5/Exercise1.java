package lab5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise1 extends JFrame{
	JButton AC = new JButton("AC Milan");
	JButton RM = new JButton("Real Madrid");
	JLabel result = new JLabel();
	JLabel last = new JLabel();
	JLabel winner = new JLabel();
	String rtxt, ltxt, wtxt;
	int x,y;
	
	public Exercise1(){
		super("Match");
		setSize(200,200);
		setLayout(new FlowLayout());
		setLocation(500,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(AC);
		add(RM);
		add(result);
		add(last);
		add(winner);
		AC.setToolTipText("AC Milan");
		RM.setToolTipText("Real Madrid");
		RM.setForeground(Color.CYAN);
		AC.setForeground(Color.PINK);
		getContentPane().setBackground(Color.MAGENTA);
		setVisible(true);
		x = 0;
		y = 0;
		rtxt = "Result: ";
		ltxt = "Last Scorer: ";
		wtxt = "Winner: ";
		result.setText(rtxt+x+"X"+y);
		last.setText(ltxt+"N/A");
		winner.setText(wtxt+"DRAW");
		Listener l1 = new Listener();
		AC.addActionListener(l1);
		RM.addActionListener(l1);
			
	}
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource()==AC){
				x++;
				result.setText(rtxt+x+"X"+y);
				last.setText(ltxt+"AC Milan");
				winner.setText(wtxt+winner());
			}
			else{
				y++;
				result.setText(rtxt+x+"X"+y);
				last.setText(ltxt+"Real Madrid");
				winner.setText(wtxt+winner());
			}
		}
		String winner(){
			if(x>y)
				return "AC Milan";
			else if(x<y)
				return "Real Madrid";
			else
				return "Draw";
		}
	}
	public static void main(String[] args){
		new Exercise1();
	}
}
