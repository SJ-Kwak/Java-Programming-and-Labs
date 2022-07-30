//Chap06-6
import java.util.*;

public class Ex06 {
	static void Print(String user, String cp) {
		System.out.println("사용자 " + user +" : 컴퓨터 " + cp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			int user = s.nextInt();
			int cp = (int)(Math.random()*3 + 1);
			
			if(user == 4) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			String _user="", _cp="";
			switch(user) {
			case SCISSOR:
				_user = "가위";
				break;
			case ROCK:
				_user = "바위";
				break;
			case PAPER:
				_user = "보";
				break;
			}
			switch(cp) {
			case SCISSOR:
				_cp = "가위";
				break;
			case ROCK:
				_cp = "바위";
				break;
			case PAPER:
				_cp = "보";
				break;
			}
			
			Print(_user,_cp);
			
			if(user==cp) {
				System.out.println("비겼습니다.");
			}else if(user==(cp+1)%3) {//0은 1에게 지고, 1은 2에게 지고, 2는 0에게 진다.
				System.out.println("사용자가 이겼습니다.");
			}else {
				System.out.println("사용자가 졌습니다.");
			}
		}
		s.close();
	}
}
