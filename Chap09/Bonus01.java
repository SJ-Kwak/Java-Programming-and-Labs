//Chap09-bonus01

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bonus01 extends JFrame {

	private JLabel la = new JLabel("Love Java");
	public Bonus01() {
		setTitle("¸¶¿ì½º ÈÙ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		la.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				// TODO Auto-generated method stub
				int n = e.getWheelRotation();
				int size = la.getFont().getSize();
				
				if(n<0 && size>10) {
					la.setFont(new Font("Arial",Font.PLAIN, size-5));
				}
				else {
					la.setFont(new Font("Arial",Font.PLAIN, size+5));
				}
			}
			
		});
		
		c.add(la);
		
		setSize(250,120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bonus01();
	}

}
