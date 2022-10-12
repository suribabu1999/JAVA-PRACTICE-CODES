package SWINGGUI;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test {
	
	public static void main(String[] args) {
		Abc obj = new Abc();
		
		
		
	}

}
class Abc extends JFrame implements ActionListener
  {  //it follow CardLayout ...it only alows to show one label at a time
	JLabel l;
	JLabel l2;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JButton b;
	JLabel l3;
	
	
	
	
	Abc(){
		setLayout(new FlowLayout());
		
		//labels and text Fields
		
		 l = new JLabel("Haii Suri...Welcome to Coding World");
		 l2 = new JLabel("You Gonna Rock it ");
		 t1 = new JTextField(20);
		 t2 = new JTextField(20);
		 t3 = new JTextField(10);
		 b = new JButton("Ok");
		 l3 =new JLabel("Result");
	
		
		//added Elements 
		add(l);
		add(l2);
		add(t1);
		add(t2);
		add(b);
		add(t3);
		add(l3);
		
		b.addActionListener(this);

		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent ae) {
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		int c = a + b;
		t3.setText(c+" ");
	}


	}
	

