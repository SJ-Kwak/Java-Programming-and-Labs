//Chap07-3
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("����������", 2000);
		map.put("�Ƹ޸�ī��", 2500);
		map.put("īǪġ��", 3000);
		map.put("ī���", 3500);
		
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī��� �ֽ��ϴ�");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		String menu;
		while(it.hasNext()) {
			System.out.print("�ֹ� >> ");
			menu = s.nextLine();
			if(menu.equals("�׸�")) {
				break;
			}
			int price = map.get(menu);
			System.out.println(menu+"�� "+price+"���Դϴ�.");
		}
		s.close();
	}

}
