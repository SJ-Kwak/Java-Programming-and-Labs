//Chap06-Bonus3
import java.util.Scanner;
public class StringRotateOnEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�� �־ �ǰ� ����, �ѱ� ��� �����մϴ�.");
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		
		System.out.println("<Enter>�� �Է��ϸ� ���ڿ��� �� ���ھ� ȸ���մϴ�.");
		
		while(true) {
			String key = s.nextLine();
			if(key.equals("")) {
				String first = text.substring(0, 1);
				String last = text.substring(1, text.length());
				text = last.concat(first);
				System.out.print(text + ">>");
				
			}else if(key.equals("q")) {
				System.out.println("�����մϴ�...");
				break;
			}else {//q�� �ƴ� �ٸ� Ű�� �Էµ� ���
				System.out.println(text + ">>");//���� ���ڿ� ���
			}
		}
		s.close();
	}

}
