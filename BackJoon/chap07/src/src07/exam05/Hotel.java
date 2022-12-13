package src07.exam05;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int arr[] = new int[T];
		for (int i = 0; i < T; i++) {
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			int N = scanner.nextInt();
			int resultW = 0;
			int resultH = 0;
			int ans = 0;

			if (N % H == 0) {
				if (N / H > 0) {
					resultW = N / H;
					resultH = H;
					arr[i] = resultH * 100 + resultW;
				} else {
					resultW = 1;
					resultH = N;
					arr[i] = resultH * 100 + resultW;
				}
			} else {
				resultW = N / H + 1;
				resultH = N % H;
				arr[i] = resultH * 100 + resultW;
			}
		}

		for (int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}
	}

}
