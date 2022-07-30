//Chap09-7

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex07 extends JFrame {

	private JLabel la = new JLabel();
	private JButton[] btn = new JButton[3];
	private String[] text = {"+2","-1","%4"};
	public Ex07() {
		setTitle("0으로 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		JPanel p = new JPanel();
		
		int num=(int)(Math.random()*60+1);
		la.setText(Integer.toString(num));
		
		c.add(p, BorderLayout.NORTH);
		p.add(la);
		
		
		JPanel q = new JPanel();
		c.add(q, BorderLayout.SOUTH);
		q.setLayout(new FlowLayout());
		
		for(int i=0;i<3;i++) {
			btn[i]=new JButton(text[i]);
			btn[i].addActionListener(new MyActionListener());
			q.add(btn[i]);
		}
		
		
		setSize(400,300);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int n = Integer.parseInt(la.getText());
			switch(e.getActionCommand()) {
			case "+2":
				n+=2;
				btn[0].setEnabled(false);
				break;
			case "-1":
				n--;
				btn[1].setEnabled(false);
				break;
			case "%4":
				n%=4;
				btn[2].setEnabled(false);
				break;
			}
			
			la.setText(Integer.toString(n));
			if(n==0) {
				Ex07.this.setTitle("성공");
				for(int i=0;i<3;i++) {
					btn[i].setEnabled(true);
				}
				int num=(int)(Math.random()*60+1);
				la.setText(Integer.toString(num));
			}
			else {
				if(!btn[0].isEnabled() && !btn[1].isEnabled() && !btn[2].isEnabled())
					Ex07.this.setTitle("실페");
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex07();
	}

}
