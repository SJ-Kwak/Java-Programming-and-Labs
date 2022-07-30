//Chap08-2
import javax.swing.*;
import java.awt.*;
public class Ex02 extends JFrame {
	
	public Ex02() {
		setTitle("BorderLayout Practice");
		Container contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new BorderLayout(50,5));
		
		contentPane.add(new JButton("North"), BorderLayout.NORTH);
		contentPane.add(new JButton("West"), BorderLayout.WEST);
		contentPane.add(new JButton("Center"), BorderLayout.CENTER);
		contentPane.add(new JButton("East"), BorderLayout.EAST);
		contentPane.add(new JButton("South"), BorderLayout.SOUTH);
		
		setSize(400,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 ex = new Ex02();
	}

}
