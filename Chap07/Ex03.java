//Chap07-3
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("에스프레소", 2000);
		map.put("아메리카노", 2500);
		map.put("카푸치노", 3000);
		map.put("카페라떼", 3500);
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		String menu;
		while(it.hasNext()) {
			System.out.print("주문 >> ");
			menu = s.nextLine();
			if(menu.equals("그만")) {
				break;
			}
			int price = map.get(menu);
			System.out.println(menu+"는 "+price+"원입니다.");
		}
		s.close();
	}

}
