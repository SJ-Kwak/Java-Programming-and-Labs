//Chap09-1

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex01 extends JFrame {
	
	private JLabel la = new JLabel("자기야");
	
	public Ex01() {
		setTitle("마우스 올리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		la.addMouseListener(new MyMouseListener());
		c.add(la);
		setSize(250,120);
		setVisible(true);
	}
	
	private class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
			la.setText("사랑해");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("자기야");			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01();
	}

}
