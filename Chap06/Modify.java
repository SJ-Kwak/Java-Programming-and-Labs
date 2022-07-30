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
				System.out.println("종료합니다.");
				break;
			}
			
			int index = (int)(Math.random()*s.length());//변경할 문자 위치 선택
			while(true) {
				int i = (int)(Math.random()*26);//알파벳 26개 중 선택
				char c = (char)('a' + i);//삽입할 문자 선택
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
