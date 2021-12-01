import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();

//		System.out.println("[1]노래추가 [2]노래삭제 [3]노래검색 [4]종료");
		while (true) {
			System.out.println("[1]노래추가 [2]노래삭제 [3]노래검색 [4]종료");
			int num = sc.nextInt();
			if (num == 1) {
				// 노래제목 추가
				// 값 추가 후 출력
				System.out.print("추가할 노래 입력>>");
				String input = sc.next();
				musicList.add(input);
				System.out.println("===list===");
				for (int i = 0, j = 1; i < musicList.size(); i++, j++) {
					System.out.println(j + ". " + musicList.get(i));

				}
			} else if (num == 2) {
				System.out.println("===list===");
				for (int i = 0, j = 1; i < musicList.size(); i++, j++) {
					System.out.println(j + ". " + musicList.get(i));
				}
				System.out.print("삭제할 노래 입력>>");
				int num1 = sc.nextInt();
				musicList.remove(num1 - 1);

			} else if (num == 3) {
				System.out.print("검색할 노래 제목 입력>> ");
				String search = sc.next();
				boolean choice = false;
				for (int i = 0, j = 1; i < musicList.size(); i++, j++) {
					if (search.equals(musicList.get(i))) {
						System.out.println("검색한 노래는 " + (i + 1) + "번에 있습니다.");
						choice = true;
					}
				}
			} else if (num == 4) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}
