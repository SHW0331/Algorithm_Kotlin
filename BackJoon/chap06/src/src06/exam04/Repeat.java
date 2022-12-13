package src06.exam04;

import java.util.Arrays;
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String[] arr = new String[num];
		Arrays.fill(arr, "");
		
		for(int i=0; i<num; i++) {
			int repeat = scanner.nextInt();
			String str = scanner.next();
			for(int x=0; x<str.length(); x++) {
				for(int y=0; y<repeat; y++) {
					arr[i] += str.charAt(x);
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
		}
	}
}