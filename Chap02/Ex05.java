//Chap02-5
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		boolean a = s.nextBoolean();
		String op = s.next();
		boolean b = s.nextBoolean();
		switch(op) {
		case "AND":
			System.out.println(b);
			break;
		case "OR":
			System.out.println(a);
			break;
		}
		s.close();
	}

}
