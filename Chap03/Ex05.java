//Chap03-5
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���� 10�� �Է�>>");
		int[] num = new int[10];
		
		//�迭 ����
		for(int i=0;i<10;i++) {
			num[i] = s.nextInt();
		}
		
		int temp = 0;
		//���� �� ����
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}	
		}
		for(int i=9;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
		s.close();
	}

}
