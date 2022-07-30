package labex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
	
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		//�͸�Ŭ����
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else {
					b.setText("Action");
					setTitle(b.getText());
				}
			}
		});
		
		setSize(250, 120);
		setVisible(true);
	}
	
	/*
	//����Ŭ����: �ٸ� Ŭ�������� ��� �Ұ���.
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
			//InnerClassListener�� ����� JFrame�� ����� ȣ��
			IndepClassListener.this.setTitle(b.getText());
			//Ÿ��Ʋ�� ��ư ���ڿ��� ���
		}
	}
	*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}

}
/*
//����Ŭ����: �ٸ� Ŭ���������� ��� ����
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}
*/
