//Chap05-6
import java.util.*;

abstract class Shape {
	abstract void draw();
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class _Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
public class ShapeEx {
	static String Shape[] = new String[10];
	static int i=0;
	static Scanner s = new Scanner(System.in);
	
	static void insert() {
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
		int shape = s.nextInt();
		switch(shape) {
		case 1:
			Shape[i] = "Line";
			i++;
			break;
		case 2:
			Shape[i] = "Rect";
			i++;
			break;
		case 3:
			Shape[i] = "Circle";
			i++;
			break;
		}
	}
	
	static void delete() {
		System.out.print("삭제할 도형의 위치>>");
		int num = s.nextInt();
		if(num>i){
			System.out.println("삭제할 수 없습니다.");
		}
		else {
			Shape[num-1] = null;
			i--;
		}
	}
	
	static void show() {
		for(int j=0;j<i;j++) {
			System.out.println(Shape[j]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		while(choice!=4) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다...");
				break;
			}
		}
			
		s.close();
	}

}
