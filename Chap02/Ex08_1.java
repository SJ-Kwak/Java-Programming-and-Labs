//Chap02-8(1)
import java.util.Scanner;
public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = s.next();
		int num = s.nextInt();
		
		if(coffee.equals("����������"))
			System.out.println(num*2000+"���Դϴ�.");
		else if(coffee.equals("�Ƹ޸�ī��"))
			System.out.println(num*2500+"���Դϴ�. ");
		else if(coffee.equals("īǪġ��"))
			System.out.println(num*3000+"���Դϴ�. ");
		else if(coffee.equals("ī���"))
			System.out.println(num*3500+"���Դϴ�. ");
		else
			System.out.println("�߸��� �Է��Դϴ�.");
		
		s.close();
	}

}
