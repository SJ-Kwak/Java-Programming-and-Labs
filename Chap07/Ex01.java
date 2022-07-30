//Chap07-1
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Vector<Float> v = new Vector<Float>();
		for(int i=0;i<5;i++) {
			v.add(s.nextFloat());
		}
		
		float num=0;
		for(int i=0;i<5;i++) {
			if(num<v.get(i)) {
				num=v.get(i);
			}
		}
		
		System.out.println("가장 큰 수는 "+num);
		s.close();
	}

}
