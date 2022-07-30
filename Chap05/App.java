//Chap05-3
import java.util.Scanner;

abstract class Calculator {
	protected int a, b;
	abstract protected int calc();
	protected void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = s.nextInt();
		b = s.nextInt();
	}
	
	public void run() {
		input();
		int res = calc();
		System.out.println("���� ���� " + res);
	}
}

class Adder extends Calculator{

	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return a + b;
	}
	
}

class Subtracter extends Calculator{

	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return a - b;
	}
	
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
	}

}
