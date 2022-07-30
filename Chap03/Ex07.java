//Chap03-7
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=99;i++) {
			int first = i/10;
			int second = i%10;
			int count = 0;
			
			
			if((first % 3 == 0) && (first > 0))
				count++;
			if((second % 3 == 0) && (second > 0))
				count++;
			
			if(count == 1)
				System.out.println(i+" 박수한번");
			else if(count == 2)
				System.out.println(i+" 박수두번");
		}
	}

}
