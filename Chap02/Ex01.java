//Chap02-1
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = a+b;
		System.out.println(a+"+"+b+"은"+" "+sum);
		s.close();
	}

}
