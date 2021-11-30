
public class Exam07 {

	public static void main(String[] args) {

		int num = 10;
		int result = getSumOfDivisors(num);

		System.out.println(num + "의 약수의 합 : " + result);

		System.out.print(num + "의 약수 : ");
		getDivisor(num);

	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;

	}

	public static void getDivisor(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
