//Chap04-3
import java.util.Scanner;
public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Rect rect[] = new Rect[4];
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			System.out.print((i+1) + " �ʺ�� ���� >>");
			rect[i] = new Rect(s.nextInt(), s.nextInt());
			sum += rect[i].getArea();
		}
		System.out.println("�����Ͽ����ϴ�...");
		System.out.println("�簢���� ��ü ���� " + sum);
		s.close();
	}

}
