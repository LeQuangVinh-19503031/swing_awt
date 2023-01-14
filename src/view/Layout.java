package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Layout extends JFrame {
	
	public Layout() {
		this.setTitle("Layout");
		this.setSize(400, 600);
		this.setLocationRelativeTo(null);
		

		JTextField field = new JTextField(); 
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");		
		JButton jButton3 = new JButton("3");		
		JButton jButton4 = new JButton("4");		
		JButton jButton5 = new JButton("5");
		JButton jButton6 = new JButton("6");
		JButton jButton7 = new JButton("7");
		JButton jButton8 = new JButton("8");
		JButton jButton9 = new JButton("9");
		JButton jButton10 = new JButton("10");
		JButton jButton11 = new JButton("11");
		JButton jButton12 = new JButton("12");
		JButton jButton13 = new JButton("13");
		JButton jButton14 = new JButton("14");
		JButton jButton15 = new JButton("15");
		
		JPanel jPanelHeader = new JPanel();
		jPanelHeader.setLayout(new BorderLayout());
		jPanelHeader.add(field, BorderLayout.CENTER);
		
		JPanel jPanelContent = new JPanel();
		jPanelContent.setLayout(new GridLayout(5,3));
		
		jPanelContent.add(jButton1);
		jPanelContent.add(jButton2);
		jPanelContent.add(jButton3);
		jPanelContent.add(jButton4);
		jPanelContent.add(jButton5);
		jPanelContent.add(jButton6);
		jPanelContent.add(jButton7);
		jPanelContent.add(jButton8);
		jPanelContent.add(jButton9);
		jPanelContent.add(jButton10);
		jPanelContent.add(jButton11);
		jPanelContent.add(jButton12);
		jPanelContent.add(jButton13);
		jPanelContent.add(jButton14);
		jPanelContent.add(jButton15);

		this.setLayout(new BorderLayout());
		this.add(jPanelHeader, BorderLayout.NORTH);
		this.add(jPanelContent, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			new Layout().setVisible(true);		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
