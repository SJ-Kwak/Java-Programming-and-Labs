//Chap4-5
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizza, waffle);
		
		if(res == true) {
			System.out.println("pizza�� waffle ũ�� ����");
		}
		else {
			System.out.println("pizza�� waffle ũ�� �ٸ�");
		}
		
		CircleManager.copy(pizza,  waffle);
		res = CircleManager.equals(pizza, waffle);
		
		if(res == true) {
			System.out.println("pizza�� waffle ũ�� ����");
		}
		else {
			System.out.println("pizza�� waffle ũ�� �ٸ�");
		}
	}

}