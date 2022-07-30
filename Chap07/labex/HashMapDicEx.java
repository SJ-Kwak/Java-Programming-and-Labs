package labex;

import java.util.*;
public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//<key,value> 쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//dic hashmap에 들어있는 모든 key,value 쌍 출력
		Set<String> keys = dic.keySet();//set컬렉션에 모든 키 받아옴
		Iterator<String> it = keys.iterator();//set에 접근하는 iterator 생성
		while(it.hasNext()) {
			String key = it.next();//키 이동하면서 찾기
			String value = dic.get(key);//키를 인덱스로 사용해서 value get
			System.out.println("("+key+","+value+")");
		}
		System.out.println();
		
		//영어 단어(key) 입력, 한글 단어(value) 출력
		Scanner s = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("찾고 싶은 단어?");
			String eng = s.next();
			//hashmap에서 키 eng의 값 kor 검색
			String kor = dic.get(eng);//eng은 키.
			if(kor==null)
				System.out.println(eng+"는 없는 단어입니다.");
			else
				System.out.println(kor);
			
		}
		s.close();
	}

}
