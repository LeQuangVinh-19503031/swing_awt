package view;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;

public class know_GUI extends JFrame{
	
	public static void main(String[] args) {
		know_GUI window1 = new know_GUI();
		window1.showWindow("Window 1", 500, 300);
		window1.closeWindow();
	}
	
	public know_GUI() {
		Button button = new Button("Thoat ne");
		button.setSize(50,50);
		button.setBounds(50, 50, 50, 50);
		button.setBackground(Color.BLUE);
		this.add(button);
	}
	
	public void showWindow() {
		this.setVisible(true);
	}
	
	public void showWindow(String title, int weight, int height) {
		this.setTitle(title);
		this.setSize(weight, height);
		this.setVisible(true);
	}
	
	public void closeWindow() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
}
