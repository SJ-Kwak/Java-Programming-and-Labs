//Chap09-4

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex04 extends JFrame {
	
	private JLabel la = new JLabel("Love Java");
	public Ex04() {
		setTitle("+,-키로 폰트 크기 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(250,120);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		
		
		public void keyPressed(KeyEvent e) {
			
			Font f = la.getFont();
			int size = f.getSize();
			
			if(e.getKeyChar() == '+')
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			if(e.getKeyChar() == '-' && size > 10)
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}