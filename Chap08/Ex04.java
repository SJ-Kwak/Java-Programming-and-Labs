//Chap08-4
import javax.swing.*;
import java.awt.*;
public class Ex04 extends JFrame {
	public Ex04() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		//1x10�� gridlayout
		contentPane.setLayout(new GridLayout(1,10));
		
		//���� �迭
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
			Color.PINK, Color.LIGHT_GRAY};
				
		//��ư 0~9���� ����
		for(int i=0;i<10;i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]);
			contentPane.add(button);//contentpane�� button ����
		}
		
		setSize(500,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 ex = new Ex04();
	}

}
