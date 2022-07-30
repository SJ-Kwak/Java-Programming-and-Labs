//Chap06-1
public class MyPoint {
	public int x, y;
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "MyPoint(" + x + "," + y + ")";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a = new MyPoint(3,20);
		System.out.println(a);
	}

}
