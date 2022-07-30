//Chap02-10
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = s.next();
		int num = s.nextInt();
		
		if(coffee.equals("에스프레소"))
			if(num >= 10)
				System.out.println((int)((num*2000)-(num*2000)*0.05)+"원입니다. ");
			else
				System.out.println(num*2000+"원입니다.");
		else if(coffee.equals("아메리카노"))
			System.out.println(num*2500+"원입니다. ");
		else if(coffee.equals("카푸치노"))
			System.out.println(num*3000+"원입니다. ");
		else if(coffee.equals("카페라떼"))
			System.out.println(num*3500+"원입니다. ");
		else
			System.out.println("잘못된 입력입니다.");
		
		s.close();
	}

}
