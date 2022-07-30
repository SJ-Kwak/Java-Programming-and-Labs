package labex;

import java.util.*;
public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//<key,value> ���� dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		//dic hashmap�� ����ִ� ��� key,value �� ���
		Set<String> keys = dic.keySet();//set�÷��ǿ� ��� Ű �޾ƿ�
		Iterator<String> it = keys.iterator();//set�� �����ϴ� iterator ����
		while(it.hasNext()) {
			String key = it.next();//Ű �̵��ϸ鼭 ã��
			String value = dic.get(key);//Ű�� �ε����� ����ؼ� value get
			System.out.println("("+key+","+value+")");
		}
		System.out.println();
		
		//���� �ܾ�(key) �Է�, �ѱ� �ܾ�(value) ���
		Scanner s = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("ã�� ���� �ܾ�?");
			String eng = s.next();
			//hashmap���� Ű eng�� �� kor �˻�
			String kor = dic.get(eng);//eng�� Ű.
			if(kor==null)
				System.out.println(eng+"�� ���� �ܾ��Դϴ�.");
			else
				System.out.println(kor);
			
		}
		s.close();
	}

}
