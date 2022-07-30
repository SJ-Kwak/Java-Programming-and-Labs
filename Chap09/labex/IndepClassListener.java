package labex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
	
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		//익명클래스
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
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
	//내부클래스: 다른 클래스에서 사용 불가능.
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			//InnerClassListener의 멤버나 JFrame의 멤버를 호출
			IndepClassListener.this.setTitle(b.getText());
			//타이틀에 버튼 문자열을 출력
		}
	}
	*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}

}
/*
//독립클래스: 다른 클래스에서도 사용 가능
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
*/
