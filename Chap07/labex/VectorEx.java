package labex;

import java.util.Vector;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();//integer value �ٷ�� ���� ����
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//vector �߰��� ����
		v.add(2,100); //index 2���� ����
		System.out.println("���� ��� ��ü ��: "+v.size());
		System.out.println("���� ���� �뷮: "+v.capacity());
		
		//vector ��� �� ���
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
