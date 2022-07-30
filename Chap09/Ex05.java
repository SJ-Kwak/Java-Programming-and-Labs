//Chap09-5

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex05 extends JFrame {
	
	public Ex05() {
		setTitle("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("c");
		la.setBounds(50,50,40,40);
		
		c.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random()*(c.getWidth()-la.getWidth()));
				int y = (int)(Math.random()*(c.getHeight()-la.getHeight()));
				la.setLocation(x,y);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		la.setLocation(50,50);
		c.add(la);
		
		
		setSize(250,120);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}

}
