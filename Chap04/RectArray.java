//Chap04-3
import java.util.Scanner;
public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Rect rect[] = new Rect[4];
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			System.out.print((i+1) + " 너비와 높이 >>");
			rect[i] = new Rect(s.nextInt(), s.nextInt());
			sum += rect[i].getArea();
		}
		System.out.println("저장하였습니다...");
		System.out.println("사각형의 전체 합은 " + sum);
		s.close();
	}

}
