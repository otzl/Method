import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);

	}


	public static int close10(int num1, int num2) {

//		int a = 10 - num1;
//		int b = 10 - num2;
//
//		a = a > 0 ? a : (a * -1);
//		b = b > 0 ? b : (b * -1);
//
		// Math class�� �ִ� abs() ���밪 �Լ� ����ϱ�
				int a = Math.abs(10 - num1);
				int b = Math.abs(10 - num2);
				
				
		if (a > b) {
			return num2;

		} else if (a < b) {
			return num1;
		} else {
			return 0;
		}
		
		
	}

}
