//Chap05-5
import java.util.Scanner;
public class StackManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringStack stack = new StringStack();
		for(int i=0;i<5;i++) {
			String s = sc.next();
			stack.push(s);
		}
		
		for(int i=0;i<5;i++) {
			System.out.print(stack.pop()+" ");
		}
		sc.close();
	}

}
