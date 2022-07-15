package src04.exam04;

import java.util.Scanner;

public class Remainder {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[10];
		int count[] = new int[42];
		
		for(int i=0; i<10; i++) {
			arr[i] = scanner.nextInt() % 42;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int y=0; y<42; y++) {
				if(arr[i] == y) {
					count[y] = 1;
				}
			}
		}
		int result = 0;
		for(int i=0; i<count.length; i++) {
			if(count[i] == 1) {
				result +=1;
			}
		}
		System.out.println(result);
	}
}
