package labex;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();//컨테이너 가져오기
		contentPane.setBackground(Color.ORANGE);//배경색 설정
		
		//contentPane.setLayout(new FlowLayout());//contentpane에 flowlayout 배치관리자(component) 달기
		//flowlayout의 배치관리자: 컴포넌트를 순서대로 부착하는 일을 맡은 객체
		//contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30,40));
		contentPane.setLayout(new BorderLayout(30,20));
		
		contentPane.add(new JButton("1"), BorderLayout.NORTH);
		contentPane.add(new JButton("2"), BorderLayout.WEST);
		contentPane.add(new JButton("3"), BorderLayout.CENTER);
		contentPane.add(new JButton("4"), BorderLayout.EAST);
		contentPane.add(new JButton("5"), BorderLayout.SOUTH);
		
		/*
		//버튼 생성
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		*/
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();		
	}

}
