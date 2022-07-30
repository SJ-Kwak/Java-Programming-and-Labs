//Chap06-Bonus1
class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public String toString() {
		return "("+ x +","+ y +") ¹ÝÁö¸§" + radius;
	}
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(radius*radius == c.radius*c.radius)
			return true;
		else
			return false;
	}
}
