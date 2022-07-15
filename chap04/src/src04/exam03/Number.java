package src04.exam03;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 1;
		
		for(int i=0; i<3; i++) {
			int num = scanner.nextInt();
			result *= num;
		}
		System.out.println(result);
		
		String find = Integer.toString(result);	
		
		int count = 0;
		for(int i=0; i<find.length(); i++) {
			for(int y=0; y<10; y++) {
				char num = (char)(y);
				if(find.charAt(i) == num) {
					count += 1;
				}
			}
			System.out.println(count);
			count = 0;
			1;
		}
	}
}
