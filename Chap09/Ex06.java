//Chap09-6

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex06 extends JFrame {
	
	public Ex06() {
		setTitle("3x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,3));
		
		JLabel[] la = new JLabel[12];
		
		for(int i=0;i<12;i++) {
			la[i]=new JLabel(Integer.toString(i));
			la[i].setBackground(Color.WHITE);
			
			c.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					JLabel label = (JLabel)e.getSource();
					int r=(int)(Math.random()*256);
					int g=(int)(Math.random()*256);
					int b=(int)(Math.random()*256);
					
					label.setOpaque(true);
					label.setBackground(new Color(r,g,b));
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
			c.add(la[i]);
		}
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

}
