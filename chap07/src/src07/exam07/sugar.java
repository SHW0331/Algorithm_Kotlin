package src07.exam07;

import java.util.Scanner;

public class sugar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x = 0;
		int y = 0;
		int z = 0;
		int ans = -1;

		if (N % 3 == 0 && N > 2) {
			x = N / 3;
		} else if (N % 3 == 2 && N > 2) {
			x = (N / 3) - 1;
			y = 1;
		}

		if (N % 5 == 0 && N > 5) {
			x = N / 5;
		} else if (N % 5 == 3 && N > 7) {
			x = (N / 5);
			y = 1;
		}

		if (N % 8 == 0 && N > 7) {
			z = N / 8;
			x = z;
			y = z;
		} else if (N % 8 == 3 && N > 10) {
			z = N / 8;
			x = z + 1;
			y = z;
		} else if (N % 8 == 5 && N > 12) {
			z = N / 8;
			x = z;
			y = z + 1;
		}
		ans = x + y;
		if (ans == 0)
			ans = -1;

		System.out.println(ans);
	}
}
