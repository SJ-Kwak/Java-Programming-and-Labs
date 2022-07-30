//Chap03-6
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			String temp = s.next();
			String ex = "exit";
			if(temp.equals(ex)) {
				System.out.println("종료합니다...");
				break;
			}
			else {
				for(int i=0;i<5;i++) {
					if(temp.equals(eng[i])) {
						System.out.println(kor[i]);
						break;
					}
					else if(!temp.equals(eng[i]) && i==4){
						System.out.println("그런 영어 단어가 없습니다.");
					}
				}
			}
			
			
		}
		s.close();
		
	}

}
