//Chap03-8
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String computer[] = {"����", "����", "��"};
		
		while(true) {
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��!>>");
			String user = s.next();
			int n = (int)(Math.random()*3); //0�� ����, 1�� ����, 2�� ��
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			System.out.print("����� = "+user+", ��ǻ�� = "+computer[n]);
			int choice = 0;
			switch(user) {
			case "����":
				choice = 0;
				break;
			case "����":
				choice = 1;
				break;
			case "��":
				choice = 2;
			}
			if(choice==n)
				System.out.print(", �����ϴ�.");
			else if(choice==(n+1)%3)
				System.out.print(", ����ڰ� �̰���ϴ�.");
			else
				System.out.print(", ��ǻ�Ͱ� �̰���ϴ�.");
			System.out.println();	
		}
		
		s.close();
	}

}
