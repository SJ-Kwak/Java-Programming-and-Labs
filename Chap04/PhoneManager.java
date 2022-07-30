//Chap04-4
import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print("인원수>>");
		int num = s.nextInt();
		Phone4 info[] = new Phone4[num];

		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			info[i] = new Phone4(s.next(), s.next());
		}
		System.out.println("저장되었습니다.");

		while (true) {
			System.out.print("검색할 이름>>");
			String name = s.next();
			if (name.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			for (int i = 0; i < num; i++) {
				if (name.equals(info[i].getName())) {
					System.out.println(info[i].getName() + "의 번호는 " + info[i].getTel() + "입니다.");
					break;
				} else if (!name.equals(info[i].getName()) && i == (num-1)) {
					System.out.println(name + "이 없습니다.");
				}
			}
		}

		s.close();
	}

}
