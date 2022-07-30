//Chap09-bonus02

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bonus02 extends JFrame {

	public Bonus02() {
		setTitle("���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel p = new JPanel();
		JPanel q = new JPanel();
		JPanel r = new JPanel();
		
		p.setBackground(Color.LIGHT_GRAY);
		q.setLayout(new GridLayout(4,4)); 
		r.setBackground(Color.YELLOW); 
		c.add(q); 
		c.add(p, BorderLayout.NORTH); 
		c.add(r, BorderLayout.SOUTH); 
		JLabel l1=new JLabel("�����Է�"); 
		JTextField tf1=new JTextField(10); 
		p.add(l1); 
		p.add(tf1); 
		JLabel l2=new JLabel("�����"); 
		JTextField tf2=new JTextField(10); 
		r.add(l2); 
		r.add(tf2); 
		for(int i=0; i<16; i++) { 
			JButton b=new JButton(); 
			String[] str= {"CE","Enter","+","-","x","/"}; 
			q.add(b); 
			if(i<10) { 
				b.setText(i+""); 
			} else { 
				b.setText(str[i-10]); 
			} if(i>11) { 
				//b.setBackground(Color.CYAN); 
				b.setOpaque(true); 
			} 
		}

		
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bonus02();
	}

}
