//Chap08-3
import javax.swing.*;
import java.awt.*;
public class Ex03 extends JFrame {

	public Ex03() {
		setTitle("FlowLayout Practice");
		Container contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("100 + 200"));
		contentPane.add(new JButton("="));
		contentPane.add(new JLabel("300"));
		
		setSize(400,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 ex = new Ex03();
	}

}
