//Chap03-6
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ��", "�̷�"};
		
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");
			String temp = s.next();
			String ex = "exit";
			if(temp.equals(ex)) {
				System.out.println("�����մϴ�...");
				break;
			}
			else {
				for(int i=0;i<5;i++) {
					if(temp.equals(eng[i])) {
						System.out.println(kor[i]);
						break;
					}
					else if(!temp.equals(eng[i]) && i==4){
						System.out.println("�׷� ���� �ܾ �����ϴ�.");
					}
				}
			}
			
			
		}
		s.close();
		
	}

}
