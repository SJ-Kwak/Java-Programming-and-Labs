//Chap03-3
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("������ �Է��ϼ���>>");
			int num;
			try{
				num = s.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("���� �Է����� �ʾ� ���α׷� �����մϴ�.");
				break;
			}
			if(num % 2 == 0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
		}
				
		s.close();
	}

}
