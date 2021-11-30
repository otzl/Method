import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// 2개의 양수를 입력 받아 2개의 숫자 중 더 큰 수를 반환하는
		// 메소드 largerNumbers()을 만들어보세요
		// 만약 두 숫자가 같다면 0을 반환

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력>> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력>> ");
		int num2 = sc.nextInt();
		int result = largerNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}

	public static int largerNumbers(int num1, int num2) {
//		if (num1 < num2) {
//			return num2;
//		} else if (num1 > num2) {
//			return num1;
//		} else {
//			return 0;
//		}
		
		// 삼항연산자를 통한 알고리즘 만들기
		// 조건? 참 : 거짓
		return num1 == num2 ? 0 : (num1 > num2 ? num1 : num2);
		
	}

}
