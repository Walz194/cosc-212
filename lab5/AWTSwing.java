package lab5;
import java.awt.*;
import javax.swing.*;

public class AWTSwing {
	public static void main(String[] args){
		java.awt.Frame awt = new java.awt.Frame("DeeDee");
		javax.swing.JFrame swg = new javax.swing.JFrame("TeeTee");
		java.awt.Button awtButton = new java.awt.Button("AWT Button");
		javax.swing.JButton swgButton = new javax.swing.JButton("SWING button");
		
		awt.setSize(600,400);
		awt.setLayout(new java.awt.FlowLayout());
		awt.add(awtButton);
		awt.setVisible(true);
		
		swg.setSize(600,400);
		swg.setLayout(new java.awt.FlowLayout());
		swg.add(swgButton);
		swg.setVisible(true);
		
	}
}
