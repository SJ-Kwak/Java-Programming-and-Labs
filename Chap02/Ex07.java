//Chap02-7
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
		String grade = s.next();
		switch(grade) {
		case "A","B":
			System.out.println("Excellent");
			break;
		case "C","D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
			break;
		}
		s.close();
	}

}
