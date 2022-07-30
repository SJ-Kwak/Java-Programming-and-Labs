//Chap02-8(2)
import java.util.Scanner;
public class Ex08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = s.next();
		int num = s.nextInt();
		
		switch(coffee) {
		case "에스프레소":
			System.out.println(num*2000+"원입니다.");
			break;
		case "아메리카노":
			System.out.println(num*2500+"원입니다. ");
			break;
		case "카푸치노":
			System.out.println(num*3000+"원입니다. ");
			break;
		case "카페라떼":
			System.out.println(num*3500+"원입니다. ");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		s.close();
	}

}
