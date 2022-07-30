//Chap05-Bonus1
class Circle_B implements _Shape{
	int radius;
	
	public Circle_B(int radius) {
		this.radius=radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("반지름 " + radius);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}
	
}
public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_Shape coin = new Circle_B(10);
		coin.redraw();
		System.out.println(" 코인의 면적은 " + coin.getArea());
	}

}
