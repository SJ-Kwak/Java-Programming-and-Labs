//Chap03-2
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수 10개 입력>>");
		int[] array = new int[10];
		
		for(int i=0;i<10;i++) {
			array[i]=s.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(array[i]%3==0)
				System.out.print(array[i]+" ");
		}
		s.close();
	}

}
