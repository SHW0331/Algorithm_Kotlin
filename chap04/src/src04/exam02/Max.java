package src04.exam02;

import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 9;
		int arr[] = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(max <= arr[i] ) {
				max = arr[i];
				count = i+1;
			}
		}
		scanner.close();
		System.out.println(max);
		System.out.println(count);
	}
}
