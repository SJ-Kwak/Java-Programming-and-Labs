//Chap07-5
import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)");
		for(int i=0;i<5;i++) {
			System.out.print("나라 이름, 인구 >> ");
			map.put(s.next(), s.nextInt());
		}
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		int max=0;
		String country=null;
		while(it.hasNext()) {
			String key = it.next();
			int people = map.get(key);
			
			if(max<people) {
				max=people;
				country=key;
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 ("+country+", "+max+")");
		
		s.close();
	}

}
