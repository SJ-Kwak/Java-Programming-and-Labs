//Chap02-8(2)
import java.util.Scanner;
public class Ex08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = s.next();
		int num = s.nextInt();
		
		switch(coffee) {
		case "����������":
			System.out.println(num*2000+"���Դϴ�.");
			break;
		case "�Ƹ޸�ī��":
			System.out.println(num*2500+"���Դϴ�. ");
			break;
		case "īǪġ��":
			System.out.println(num*3000+"���Դϴ�. ");
			break;
		case "ī���":
			System.out.println(num*3500+"���Դϴ�. ");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		s.close();
	}

}
