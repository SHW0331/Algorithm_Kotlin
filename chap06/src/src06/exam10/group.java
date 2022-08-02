package src06.exam10;

import java.util.Scanner;

public class group {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String arr[] = new String[num];

		int result = 0;

		for (int i = 0; i < num; i++) {
			arr[i] = scanner.next();
			String delete = "";
			int count[] = new int[26];
			int check = 0;

			for (int y = 0; y < arr[i].length(); y++) {
				if (y == arr[i].length() - 1 && arr[i].length() > 1) {
					if (arr[i].charAt(y) == arr[i].charAt(y - 1)) {

					} else {
						delete += arr[i].charAt(y);
					}
				} else if (arr[i].length() == 1) {
					delete += arr[i].charAt(y);
				} else {
					if (arr[i].charAt(y) == arr[i].charAt(y + 1)) {

					} else {
						delete += arr[i].charAt(y);
					}
				}
			}

			for (int x = 0; x < delete.length(); x++) {
				for (int z = 97; z < 123; z++) {
					if (delete.charAt(x) == (char) z) {
						count[z - 97] += 1;
					}
				}
			}

			for (int k = 0; k < count.length; k++) {
				if (count[k] > 1) {
					check = 0;
					break;
				} else
					check = 1;
			}
			result += check;
		}
		System.out.println(result);
	}
}
