import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

	}


	public static int close10(int num1, int num2) {

//		int a = 10 - num1;
//		int b = 10 - num2;
//
//		a = a > 0 ? a : (a * -1);
//		b = b > 0 ? b : (b * -1);
//
		// Math class에 있는 abs() 절대값 함수 사용하기
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
