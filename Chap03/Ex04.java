//Chap03-4
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] day = {'��','��','ȭ','��','��','��','��'};
		
		while(true) {
			System.out.print("������ �Է��ϼ���>>");
			int num;
			try{
				num = s.nextInt();
				if(num < 0) {
					System.out.println("���α׷� �����մϴ�...");
					break;
				}
				System.out.println(day[num % day.length]);
			}catch(InputMismatchException e) {
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
				s.nextLine();
			}
		}
		s.close();
	}

}
