//Chap04-4
import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print("�ο���>>");
		int num = s.nextInt();
		Phone4 info[] = new Phone4[num];

		for (int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");
			info[i] = new Phone4(s.next(), s.next());
		}
		System.out.println("����Ǿ����ϴ�.");

		while (true) {
			System.out.print("�˻��� �̸�>>");
			String name = s.next();
			if (name.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			for (int i = 0; i < num; i++) {
				if (name.equals(info[i].getName())) {
					System.out.println(info[i].getName() + "�� ��ȣ�� " + info[i].getTel() + "�Դϴ�.");
					break;
				} else if (!name.equals(info[i].getName()) && i == (num-1)) {
					System.out.println(name + "�� �����ϴ�.");
				}
			}
		}

		s.close();
	}

}
