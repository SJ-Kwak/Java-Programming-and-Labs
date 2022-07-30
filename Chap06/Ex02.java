//Chap06-2
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			String query = s.nextLine();
			StringTokenizer st = new StringTokenizer(query, " ");
			
			if(query.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			int n = st.countTokens();
			System.out.println("어절 개수는 "+n);
			
		}
		s.close();
	}

}
