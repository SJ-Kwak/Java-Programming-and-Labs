//Chap07-4
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("2000~2009����� 1�� ������ Ű(cm)�� �Է�");
		System.out.print(">>");
		
		for(int i=0;i<10;i++) {
			v.add(s.nextInt());
		}
		
		int num=0;
		int year=0;
		for(int i=0;i<9;i++) {
			if(num < (v.get(i+1)-v.get(i)) ) {
				num=v.get(i+1)-v.get(i);
				year=i;
			}
		}
		
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� 200"+year+"�� "+(float)num+"cm");
		s.close();
	}

}
