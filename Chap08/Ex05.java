//Chap08-5
import javax.swing.*;
import java.awt.*;
public class Ex05 extends JFrame {
	
	public Ex05() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		//4x4
		contentPane.setLayout(new GridLayout(4,4));
		
		//배경색 배열
		Color[] color = {
			Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
			Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
			Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA
		};
		
		for(int i=0;i<16;i++) {
			JLabel label = new JLabel(Integer.toString(i));
			label.setOpaque(true);
			label.setBackground(color[i]);
			contentPane.add(label);
		}
		
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex05 ex = new Ex05();
	}

}
