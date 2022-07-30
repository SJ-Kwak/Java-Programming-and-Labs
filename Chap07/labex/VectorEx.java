package labex;

import java.util.Vector;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();//integer value 다루는 벡터 생성
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//vector 중간에 삽입
		v.add(2,100); //index 2번에 삽입
		System.out.println("벡터 요소 객체 수: "+v.size());
		System.out.println("벡터 현재 용량: "+v.capacity());
		
		//vector 모든 값 출력
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		int sum=0;
		for(int i=0;i<v.size();i++) {
			sum+=v.elementAt(i);
		}
		System.out.println(sum);
	}

}
