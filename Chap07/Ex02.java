//Chap07-2
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<String> st = new ArrayList<String>();
		
		final double a=4.0, b=3.0, c=2.0, d=1.0, f=0.0;
		
		System.out.print("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
		for(int i=0;i<5;i++) {
			st.add(s.next());
		}
		
		for(int i=0;i<5;i++) {
			switch(st.get(i)) {
			case "A":
				System.out.print(a+" ");
				break;
			case "B":
				System.out.print(b+" ");
				break;
			case "C":
				System.out.print(c+" ");
				break;
			case "D":
				System.out.print(d+" ");
				break;
			case "F":
				System.out.print(f+" ");
				break;
				
			}
		}
		
		s.close();
		
	}

}
