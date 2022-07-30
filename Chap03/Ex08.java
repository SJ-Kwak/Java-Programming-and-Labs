//Chap03-8
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String computer[] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			String user = s.next();
			int n = (int)(Math.random()*3); //0은 가위, 1은 바위, 2는 보
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			System.out.print("사용자 = "+user+", 컴퓨터 = "+computer[n]);
			int choice = 0;
			switch(user) {
			case "가위":
				choice = 0;
				break;
			case "바위":
				choice = 1;
				break;
			case "보":
				choice = 2;
			}
			if(choice==n)
				System.out.print(", 비겼습니다.");
			else if(choice==(n+1)%3)
				System.out.print(", 사용자가 이겼습니다.");
			else
				System.out.print(", 컴퓨터가 이겼습니다.");
			System.out.println();	
		}
		
		s.close();
	}

}
