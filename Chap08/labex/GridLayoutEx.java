package labex;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		super("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		JLabel la = new JLabel("Hello!");
		la.setLocation(130,50);
		la.setSize(200,20);
		contentPane.add(la);
		
		/*
		//1x10의 gridlayout
		contentPane.setLayout(new GridLayout(1,10,5,5));
		
		//버튼 0~9까지 부착
		for(int i=0;i<10;i++) {
			String text = Integer.toString(i);//i를 문자열로 변환
			JButton button = new JButton(text);
			contentPane.add(button);//contentpane에 button 부착
		}
		*/
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();

	}

}
