//Chap06-Bonus2
import java.util.*;
public class Modify {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine();
			StringBuffer sb = new StringBuffer(s);
			if(s.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			int index = (int)(Math.random()*s.length());//������ ���� ��ġ ����
			while(true) {
				int i = (int)(Math.random()*26);//���ĺ� 26�� �� ����
				char c = (char)('a' + i);//������ ���� ����
				if(!sb.equals(c)) {
					sb.replace(index, index+1, Character.toString(c));
					break;
				}
			}
			System.out.println(sb);
		}
		sc.close();
	}

}