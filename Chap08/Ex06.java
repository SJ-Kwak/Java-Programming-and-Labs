//Chap08-6
import javax.swing.*;
import java.awt.*;
public class Ex06 extends JFrame{
	
	public Ex06(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		contentPane.setLayout(null);
		
		for(int i=0;i<20;i++) {
			JLabel label = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*220)+30;
			int y = (int)(Math.random()*220)+30;
			
			label.setLocation(x,y);
			label.setSize(20,20);
			label.setForeground(Color.MAGENTA);
			contentPane.add(label);
		}
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex06 ex = new Ex06();
	}

}
