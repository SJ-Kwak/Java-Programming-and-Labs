//Chap05-Bonus1
interface _Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("---�ٽ� �׸��ϴ�.---");
		draw();
	}
}
