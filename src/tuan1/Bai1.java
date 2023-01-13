package tuan1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Bai1 extends JFrame{
	
	JTextField jTextFieldA, jTextFieldB, jTextFieldC, jTextFieldKQ;
	JButton buttonGiai, buttonThoat, buttonXoa;
	
	public Bai1() {
		setTitle("Giai phuong trình bậc 2");
		setSize(400,300);
		JPanel panelNorth = new JPanel();
		// NORTH
		JLabel labelTitle = new JLabel("Giải Phương trình");
		add(java.awt.BorderLayout.NORTH, panelNorth);
		panelNorth.add(labelTitle);
		panelNorth.setBackground(Color.GRAY);
		// SOUTH
		JPanel jPanelSouth = new JPanel();
		buttonGiai = new JButton("Giải");
		buttonThoat = new JButton("Thoát");
		buttonXoa = new JButton("Xóa");
		add(java.awt.BorderLayout.SOUTH, jPanelSouth);
		jPanelSouth.setBorder(new TitledBorder(new EtchedBorder(), "Tác vụ"));
		jPanelSouth.add(buttonGiai);
		jPanelSouth.add(buttonThoat);
		jPanelSouth.add(buttonXoa);
		// CENTER
		JLabel jLabelA = new JLabel("He so a:");
		JLabel jLabelB = new JLabel("He so b:");
		JLabel jLabelC = new JLabel("He so c:");
		JLabel jLabelKQ = new JLabel("Ket Qua:");
		
		// Create frame set input value
		JPanel jPanelCenter = new JPanel();
		jPanelCenter.setLayout(null);
		jPanelCenter.add(jLabelA);
		jPanelCenter.add(jLabelB);
		jPanelCenter.add(jLabelC);
		jPanelCenter.add(jLabelKQ);
		jLabelA.setBounds(40,30,50,20);
		jLabelB.setBounds(40,60,50,20);
		jLabelC.setBounds(40,90,50,20);
		jLabelKQ.setBounds(40,120,50,20);
		
		jTextFieldA = new JTextField();
		jTextFieldB = new JTextField();
		jTextFieldC = new JTextField();
		jTextFieldKQ = new JTextField();
		
		jPanelCenter.add(jTextFieldA);
		jPanelCenter.add(jTextFieldB);
		jPanelCenter.add(jTextFieldC);
		jPanelCenter.add(jTextFieldKQ);
	
		jTextFieldA.setBounds(90,30, 250, 20);
		jTextFieldB.setBounds(90,60, 250, 20);
		jTextFieldC.setBounds(90,90, 250, 20);
		jTextFieldKQ.setBounds(90,120, 250, 20);
		jTextFieldKQ.setEditable(false);
		
		add(java.awt.BorderLayout.CENTER, jPanelCenter);

		buttonGiai.addActionListener(e->{
			try {
				Integer.parseInt(jTextFieldA.getText());
				Integer.parseInt(jTextFieldB.getText());
				Integer.parseInt(jTextFieldC.getText());
			}catch (NumberFormatException er) {
				JOptionPane.showMessageDialog(null, er.getMessage());
				return;
			}
			int a = Integer.parseInt(jTextFieldA.getText());
			int b = Integer.parseInt(jTextFieldB.getText());
			int c = Integer.parseInt(jTextFieldC.getText());
			if(a==0) {
				if(b==0)
					jTextFieldKQ.setText(" Vo nghiem");
				else
					jTextFieldKQ.setText(" " + ((float) -c / b));
			}else {
				float delta = b*b - 4*a*c;
				if(delta<0)
					jTextFieldKQ.setText(" Vo nghiem");
				else if(delta == 0)
					jTextFieldKQ.setText(" x1 = x2 = "+ ((float) -b / 2 * a));
				else{
					jTextFieldKQ.setText(" x1 = " + (((float) -b + Math.sqrt(delta) / 2 * a))
							+ ", x2 = " + (((float) -b - Math.sqrt(delta) / 2 * a)));
				}
			}
		});
		
		buttonXoa.addActionListener(e->{
			jTextFieldA.setText("");
			jTextFieldB.setText("");
			jTextFieldC.setText("");
			jTextFieldKQ.setText("");			
		});
		
		buttonThoat.addActionListener(e->{
			System.exit(0);
		});
	}
	
	public static void main(String[] args) {
		new Bai1().setVisible(true);
	}
}
