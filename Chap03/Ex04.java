//Chap03-4
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] day = {'일','월','화','수','목','금','토'};
		
		while(true) {
			System.out.print("정수를 입력하세요>>");
			int num;
			try{
				num = s.nextInt();
				if(num < 0) {
					System.out.println("프로그램 종료합니다...");
					break;
				}
				System.out.println(day[num % day.length]);
			}catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				s.nextLine();
			}
		}
		s.close();
	}

}
