package labex;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();//integer value 다루는 벡터 생성
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//vector 중간에 삽입
		v.add(2,100); //index 2번에 삽입
		
		/*
		//vector 모든 값 출력
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		int sum=0;
		for(int i=0;i<v.size();i++) {
			sum+=v.elementAt(i);
		}
		System.out.println(sum);
		*/
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		int sum=0;
		while(it.hasNext()) {
			sum+=it.next();
		}
		System.out.println(sum);
	}

}
