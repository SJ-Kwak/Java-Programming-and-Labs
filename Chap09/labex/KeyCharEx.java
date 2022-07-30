package labex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
	
	//private JLabel la = new JLabel("<Enter>Ű�� ������ �ٲ�ϴ�");
	private JPanel contentPane = new JPanel();
	private JLabel la = new JLabel("HELLO");
	
	public KeyCharEx() {
		//super("KeyListener�� ���� Ű �Է� ����");
		//setTitle("Mouse �̺�Ʈ ����");
		
		super("�����¿� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//c.setLayout(new FlowLayout());
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
				
		setSize(200,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	/*
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			
			switch(e.getKeyChar()) {
			case '\n':
				la.setText("r="+r+", g="+g+", b="+b);
				getContentPane().setBackground(new Color(r,g,b));
				break;
				
			case 'q':
				System.exit(0);
			}
		}
	}
	*/
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-10);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+10);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+10, la.getY());
				break;
			
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCharEx();
	}

}
