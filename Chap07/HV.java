//Chap07-Bonus1
import java.util.*;

public class HV {
	public static Vector<String> hashToVector(HashMap<String, String> h){
		Vector<String> v = new Vector<String>();
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			v.add(h.get(key));
		}
		return v;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("����", "112");
		h.put("ȭ��", "119");
		h.put("��ȭ��ȣ", "114");
		
		Vector<String> v = hashToVector(h);
		for(int n=0; n<v.size(); n++) {
			System.out.print(v.get(n) + " ");
		}
	}

}