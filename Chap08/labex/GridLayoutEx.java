package labex;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		super("GridLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		JLabel la = new JLabel("Hello!");
		la.setLocation(130,50);
		la.setSize(200,20);
		contentPane.add(la);
		
		/*
		//1x10�� gridlayout
		contentPane.setLayout(new GridLayout(1,10,5,5));
		
		//��ư 0~9���� ����
		for(int i=0;i<10;i++) {
			String text = Integer.toString(i);//i�� ���ڿ��� ��ȯ
			JButton button = new JButton(text);
			contentPane.add(button);//contentpane�� button ����
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
