//Chap07-7
import java.util.*;

class Location{
	private int x,y;
	
	Location(int x, int y){
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}


public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Location> al = new ArrayList<Location>();
		
		al.add(new Location(0,0));
		System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라");
		
		for(int i=0;i<5;i++) {
			System.out.print(">>");
			al.add(new Location(s.nextInt(), s.nextInt()));
		}
		
		al.add(new Location(0,0));
		
		double sum=0.0;
		for(int i=1;i<al.size();i++) {
			Location p1=al.get(i-1);
			double x1=p1.getX();
			double y1=p1.getY();
			
			Location p2=al.get(i);
			double x2=p2.getX();
			double y2=p2.getY();
			
			double x=x2-x1;
			double y=y2-y1;
			
			sum+=Math.sqrt( (x*x) + (y*y) );
		}
		
		System.out.println("총 이동 거리는 "+sum);
		
		s.close();
	}

}
