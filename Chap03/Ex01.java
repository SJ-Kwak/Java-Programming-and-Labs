//Chap03-1
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String str = s.next();
		char alp = str.charAt(0);
		
		for(int i='a';i<=alp;i++) {
			if(i<=alp)
				System.out.print((char)i);
			for(int j=i+1;j<=alp;j++) {
				if(j<=alp)
					System.out.print((char)j);
			}
			System.out.println();
		}
		
		s.close();
	}

}
