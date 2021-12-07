package lab7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TestingImageComponent extends JFrame{
		ImageComponent ic;
		JMenuBar jBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem open = new JMenuItem("Open");
		TestingImageComponent(){
		ic = new ImageComponent("42.jpg");
		file.add(open);
		jBar.add(file);
		setJMenuBar(jBar);
		setSize(400,400);
		add(ic);
		open.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				JFileChooser fc = new JFileChooser();
				fc.showOpenDialog(null);
				ic.setImage(fc.getSelectedFile().getPath());
				setTitle(fc.getSelectedFile().getName());
				repaint();
			}
		});
	}
public static void main(String[]args){
	new TestingImageComponent().setVisible(true);
	}
}
