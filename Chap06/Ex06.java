//Chap06-6
import java.util.*;

public class Ex06 {
	static void Print(String user, String cp) {
		System.out.println("����� " + user +" : ��ǻ�� " + cp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("����(1), ����(2), ��(3), ������(4)>>");
			int user = s.nextInt();
			int cp = (int)(Math.random()*3 + 1);
			
			if(user == 4) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			
			String _user="", _cp="";
			switch(user) {
			case SCISSOR:
				_user = "����";
				break;
			case ROCK:
				_user = "����";
				break;
			case PAPER:
				_user = "��";
				break;
			}
			switch(cp) {
			case SCISSOR:
				_cp = "����";
				break;
			case ROCK:
				_cp = "����";
				break;
			case PAPER:
				_cp = "��";
				break;
			}
			
			Print(_user,_cp);
			
			if(user==cp) {
				System.out.println("�����ϴ�.");
			}else if(user==(cp+1)%3) {//0�� 1���� ����, 1�� 2���� ����, 2�� 0���� ����.
				System.out.println("����ڰ� �̰���ϴ�.");
			}else {
				System.out.println("����ڰ� �����ϴ�.");
			}
		}
		s.close();
	}
}
