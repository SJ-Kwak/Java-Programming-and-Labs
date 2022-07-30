//Chap02-6
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
		int money = s.nextInt();
		int a, b, c, d, e, f, g;
		//a:50000원, b:10000원, c:1000원, d:500원, e:100원, f:10원, g:1원
		
		a=money/50000;
		money%=50000;
		
		b=money/10000;
		money%=10000;
		
		c=money/1000;
		money%=1000;
		
		d=money/500;
		money%=500;
		
		e=money/100;
		money%=100;
		
		f=money/10;
		money%=10;
		
		g=money;
		
		System.out.print("오만원"+a+"개, ");
		System.out.print("만원"+b+"개, ");
		System.out.print("천원"+c+"개, ");
		System.out.print("500원"+d+"개, ");
		System.out.print("100원"+e+"개, ");
		System.out.print("10원"+f+"개, ");
		System.out.print("1원"+g+"개");
		
		s.close();
	}

}
