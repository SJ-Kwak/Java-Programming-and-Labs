package labex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
	
	//private JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");
	private JPanel contentPane = new JPanel();
	private JLabel la = new JLabel("HELLO");
	
	public KeyCharEx() {
		//super("KeyListener의 문자 키 입력 예제");
		//setTitle("Mouse 이벤트 예제");
		
		super("상하좌우 키를 이용하여 텍스트 움직이기");
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
