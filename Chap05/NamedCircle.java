//Chpa05-1
public class NamedCircle extends Circle{
	private String name;
	
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name=name;
	}
	
	public void show() {
		System.out.println(name + ", ¹ÝÁö¸§ = " + getRadius());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}

}
