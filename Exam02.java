import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();

//		System.out.println("[1]�뷡�߰� [2]�뷡���� [3]�뷡�˻� [4]����");
		while (true) {
			System.out.println("[1]�뷡�߰� [2]�뷡���� [3]�뷡�˻� [4]����");
			int num = sc.nextInt();
			if (num == 1) {
				// �뷡���� �߰�
				// �� �߰� �� ���
				System.out.print("�߰��� �뷡 �Է�>>");
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
				System.out.print("������ �뷡 �Է�>>");
				int num1 = sc.nextInt();
				musicList.remove(num1 - 1);

			} else if (num == 3) {
				System.out.print("�˻��� �뷡 ���� �Է�>> ");
				String search = sc.next();
				boolean choice = false;
				for (int i = 0, j = 1; i < musicList.size(); i++, j++) {
					if (search.equals(musicList.get(i))) {
						System.out.println("�˻��� �뷡�� " + (i + 1) + "���� �ֽ��ϴ�.");
						choice = true;
					}
				}
			} else if (num == 4) {
				System.out.println("���α׷� ����");
				break;
			}

		}
	}
}
