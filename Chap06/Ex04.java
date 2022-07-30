//Chap06-4
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String query = sc.nextLine();
		StringTokenizer st = new StringTokenizer(query, "+");
		
		int sum = 0;
		while(st.hasMoreTokens()){
			String s = st.nextToken();
			String n = s.trim();
			sum += Integer.parseInt(n);
		}
		System.out.println("гую╨ "+sum);
		
		sc.close();
	}

}
