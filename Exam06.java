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
		
		// Arrays 클래스의 toString() 함수 사용하기
		
		System.out.println(Arrays.toString(array));
		
		
	}
}