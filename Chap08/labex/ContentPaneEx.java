package labex;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();//�����̳� ��������
		contentPane.setBackground(Color.ORANGE);//���� ����
		
		//contentPane.setLayout(new FlowLayout());//contentpane�� flowlayout ��ġ������(component) �ޱ�
		//flowlayout�� ��ġ������: ������Ʈ�� ������� �����ϴ� ���� ���� ��ü
		//contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30,40));
		contentPane.setLayout(new BorderLayout(30,20));
		
		contentPane.add(new JButton("1"), BorderLayout.NORTH);
		contentPane.add(new JButton("2"), BorderLayout.WEST);
		contentPane.add(new JButton("3"), BorderLayout.CENTER);
		contentPane.add(new JButton("4"), BorderLayout.EAST);
		contentPane.add(new JButton("5"), BorderLayout.SOUTH);
		
		/*
		//��ư ����
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
