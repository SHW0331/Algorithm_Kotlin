package src06.exam02;

import java.util.Scanner;

public class addNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		String num = scanner.next();
		
		String[] arr;
		arr = num.split("");
		int result = 0;
		
		for(int i=0; i<length; i++) {
			result += Integer.parseInt(arr[i]);
		}
		System.out.println(result);
	}
}

//  = new String[length];