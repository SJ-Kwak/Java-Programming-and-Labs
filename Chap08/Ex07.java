//Chap08-7
import javax.swing.*;
import java.awt.*;
public class Ex07 extends JFrame{
	
	public Ex07() {
		setTitle("3개의 패널을 가지는 frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		contentPane.setLayout(new BorderLayout());
		
		JPanel header = new JPanel();
		JPanel center = new JPanel();
		JPanel footer = new JPanel();
		
		contentPane.add(header, BorderLayout.NORTH);
		contentPane.add(center, BorderLayout.CENTER);
		contentPane.add(footer, BorderLayout.SOUTH);
		
		header.setBackground(Color.YELLOW);
		header.setLayout(new FlowLayout());
		header.add(new JButton("새로 배치"));
		header.add(new JButton("종료"));
		
		center.setLayout(null);
		for(int i=0;i<10;i++) {
			JLabel label = new JLabel("*");
			int x = (int)(Math.random()*300)+50;
			int y = (int)(Math.random()*150)+50;
			
			label.setLocation(x,y);
			label.setSize(20,20);
			label.setForeground(Color.MAGENTA);
			center.add(label);
		}
		
		footer.setBackground(Color.LIGHT_GRAY);
		footer.setLayout(new FlowLayout());
		footer.add(new JButton("별 개수 수정"));
		footer.add(new JTextField(15));
		
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex07 ex = new Ex07();
	}

}
