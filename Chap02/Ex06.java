//Chap02-6
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int money = s.nextInt();
		int a, b, c, d, e, f, g;
		//a:50000��, b:10000��, c:1000��, d:500��, e:100��, f:10��, g:1��
		
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
		
		System.out.print("������"+a+"��, ");
		System.out.print("����"+b+"��, ");
		System.out.print("õ��"+c+"��, ");
		System.out.print("500��"+d+"��, ");
		System.out.print("100��"+e+"��, ");
		System.out.print("10��"+f+"��, ");
		System.out.print("1��"+g+"��");
		
		s.close();
	}

}
