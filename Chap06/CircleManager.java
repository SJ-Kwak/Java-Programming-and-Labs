//Chap06-Bonus1
public class CircleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(1,2,10);
		Circle b = new Circle(5,6,10);
		System.out.println("�� 1: " + a);
		System.out.println("�� 2: " + b);
		
		if(a.equals(b))
			System.out.println("���� ���Դϴ�.");
		else
			System.out.println("�ٸ� ���Դϴ�.");
	}

}