import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = getAbsoluteValue(num1, num2);
		System.out.println("��� Ȯ�� : " + result);

	}

	public static int getAbsoluteValue(int num1, int num2) {
		return Math.abs(num1 - num2);

	}
}
