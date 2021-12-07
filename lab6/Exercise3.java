package lab6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exercise3 extends JFrame{
	JTextArea texts = new JTextArea();
	JMenu color = new JMenu("Colors");
	JMenu font = new JMenu("Fonts");
	JMenuBar bar = new JMenuBar();
	JScrollPane scroll = new JScrollPane(texts);
	public JMenuItem Blue, Red, Black;
	public JMenuItem TimesNewRoman, MSSansSerif, CourierNew, BodoniMTBlack;
	Font fnt1 = new Font("Times new roman",Font.BOLD,20);
	Font fnt2 = new Font("MS Sans Serif",Font.BOLD,20);
	Font fnt3 = new Font("Courier New",Font.BOLD,20);
	Font fnt4 = new Font("Bodoni MT Black",Font.BOLD,20);
	public Exercise3(){
		super("Text Editor");
		setJMenuBar(bar);
		bar.add(font);
		font.add(TimesNewRoman = new JMenuItem("Times New Roman"));
		font.add(MSSansSerif = new JMenuItem("MS Sans Serif"));
		font.add(CourierNew = new JMenuItem("Courier New"));
		font.add(BodoniMTBlack = new JMenuItem("Bodoni MT Black"));
		bar.add(color);
		color.add(Blue = new JMenuItem("Blue"));
		color.add(Red = new JMenuItem("Red"));
		color.add(Black = new JMenuItem("Black"));
		add(scroll);
		TimesNewRoman.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if (event.getSource()==TimesNewRoman)
					TimesNewRoman.getText().setFont(fnt1);
			}
		});
		MSSansSerif.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if (event.getSource()==MSSansSerif)
					MSSansSerif.getText().setFont(fnt2);
			}
		});
		CourierNew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if (event.getSource()==CourierNew)
					CourierNew.getText().setFont(fnt3);
			}
		});
		TimesNewRoman.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if (event.getSource()==TimesNewRoman)
					TimesNewRoman.getText().setFont(fnt1);
			}
		});
	}
}
