package lab7;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TestingCup extends JFrame{
	CupComponent cc = new CupComponent();
	public TestingCup(){
		super("resize me");
		add(cc);
		setSize(400,400);
	}
public static void main(String[] args){
	new TestingCup().setVisible(true);
	}
}
