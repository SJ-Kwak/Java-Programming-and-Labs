//Chap02-3
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("x ���� �Է��ϼ���>>");
		int x = s.nextInt();
		int y = x*x - 3*x +7;
		System.out.println("x="+x+", y="+y);
		s.close();
	}

}
