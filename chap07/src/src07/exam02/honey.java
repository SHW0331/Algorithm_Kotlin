package src07.exam02;

import java.util.Scanner;

public class honey {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result = 0;

		for (int i = 0; i < num; i++) {
			String str = scanner.next();
			String delete = "";
			boolean check[] = new boolean[26];
			boolean tmp = true;

			for (int y = 0; y < str.length(); y++) {
				int index = str.charAt(y) - 'a';
				if(check[index]) {
					if(str.charAt(y) != str.charAt(y-1)) {
						tmp = false;
						break;
					}
 				} else
					check[index] = true;
			}
			if(tmp) result++;
		}
		System.out.println(result);
	}

}
