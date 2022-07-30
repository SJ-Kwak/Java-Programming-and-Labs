//Chap06-3

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num[] = new int[3];
			for(int x=0;x<3;x++) {
				num[x] = (int)(Math.random()*3+1);
				System.out.print(num[x]+" ");
			}
			System.out.println();
			if(num[0]==num[1] && num[1]==num[2]) {
				System.out.println("¼º°ø");
				break;
			}
		}
	}

}
