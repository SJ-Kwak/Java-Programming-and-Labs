package labex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventAllEx extends JFrame{

	private JLabel la = new JLabel("Move Me");
	
	public MouseEventAllEx() {
		setTitle("MouseListener¿Í MouseMotionListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.setLayout(null);
		
		la.setSize(80,20);
		la.setLocation(100,80);
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(), e.getY());
			setTitle("mousePressed("+e.getX()+", "+e.getY()+")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseReleased("+e.getX()+", "+e.getY()+")");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventAllEx();
	}

}
