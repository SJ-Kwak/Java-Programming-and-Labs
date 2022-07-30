//Chap09-2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex02 extends JFrame {
	
	public Ex02() {
		setTitle("R키로 배경색 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.CYAN);
		c.addKeyListener(new MyKeyListener());
		
		setSize(250,120);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == 'r')
				getContentPane().setBackground(Color.RED);
		}
		public void keyReleased(KeyEvent e) {
			getContentPane().setBackground(Color.CYAN);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

}
