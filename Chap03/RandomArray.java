//Chap03-Bonus01
public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][]; //2���� ���� �迭 ����
		intArray = new int[3][4];//intArray�� 3x4 ���� �迭 ����
		
		//12���� ������ �����ϰ� �߻����� �迭�� ������� �����Ѵ�.
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				intArray[i][j] = (int)(Math.random()*10); //0~9�� ��������
		
		//3x4 �迭�� ����Ѵ�.
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[0].length;j++)
				System.out.print(intArray[i][j]+" ");
			System.out.println();
		}
		
		//3x4 �迭�� ���� ���Ͽ� ����Ѵ�
		int i=0, sum=0;
		while(i<3) {
			for(i=0;i<intArray.length;i++)
				for(int j=0;j<intArray[0].length;j++)
					sum+=intArray[i][j];
		}
		System.out.println("���� "+sum);
	}

}