//Chap02-2
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("몇 층인지 입력하세요>>");
		int floor = s.nextInt();
		int height = 5 * floor;
		System.out.println(height+"m 입니다.");
		s.close();
	}

}
