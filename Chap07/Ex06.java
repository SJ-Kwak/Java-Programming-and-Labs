//Chap07-6
import java.util.*;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println("** 포인트 관리 프로그램입니다 **");
				
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name = s.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			int point = s.nextInt();		
			
			
			if(map.containsKey(name))
				map.put(name, map.get(name)+point);
			else
				map.put(name, point);
			
			
			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String key = it.next();
				int value = map.get(key);
				System.out.print("("+key+", "+value+")");
			}
			System.out.println();
		}
		
		s.close();
	}

}
