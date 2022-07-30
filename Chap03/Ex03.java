//Chap03-3
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("정수를 입력하세요>>");
			int num;
			try{
				num = s.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
				break;
			}
			if(num % 2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
		}
				
		s.close();
	}

}
