//Chap02-9
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��ϼ���>>");
		int num = s.nextInt();
		int first = num / 10;
		int second = num % 10;
		
		if((first%3==0) && (second%3==0))
			System.out.println("�ڼ�¦¦");
		else if((first%3==0) || (second%3==0))
			System.out.println("�ڼ�¦");
		else
			System.out.println("�ڼ�����");
		
		s.close();
	}

}
