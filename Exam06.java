import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {

		int[]array = {1,3,4,8,7,9,10};
		arrayToString(array);
		
	}

	public static void arrayToString(int[]array) {
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
		// Arrays Ŭ������ toString() �Լ� ����ϱ�
		
		System.out.println(Arrays.toString(array));
		
		
	}
}