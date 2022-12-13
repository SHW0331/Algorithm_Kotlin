package src07.exam07;

import java.util.Scanner;

public class sugar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int ans = 0;

		if (N == 4 || N == 7) {
			ans = -1;
		} else if (N % 5 == 0) {
			ans = N / 5;
		} else if (N % 5 == 1 || N % 5 == 3) {
			ans = N / 5 + 1;
		} else if (N % 5 == 4 || N % 5 == 2) {
			ans = N / 5 + 2;
		} else {
			ans = -1;
		}

		System.out.println(ans);
	}
}
