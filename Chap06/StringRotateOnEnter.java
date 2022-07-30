//Chap06-Bonus3
import java.util.Scanner;
public class StringRotateOnEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어, 한글 모두 가능합니다.");
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		
		System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");
		
		while(true) {
			String key = s.nextLine();
			if(key.equals("")) {
				String first = text.substring(0, 1);
				String last = text.substring(1, text.length());
				text = last.concat(first);
				System.out.print(text + ">>");
				
			}else if(key.equals("q")) {
				System.out.println("종료합니다...");
				break;
			}else {//q가 아닌 다른 키가 입력된 경우
				System.out.println(text + ">>");//현재 문자열 출력
			}
		}
		s.close();
	}

}
