//Chap04-2
import java.util.Scanner;

public class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		Phone Spongebob = new Phone(s.next(), s.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		Phone Zingzing = new Phone(s.next(), s.next());
		
		System.out.println(Spongebob.getName() + "�� ��ȣ " + Spongebob.getTel());
		System.out.println(Zingzing.getName() + "�� ��ȣ " + Zingzing.getTel());
		s.close();
	}
}
