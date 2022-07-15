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
		String find = Integer.toString(result);	
		
		int count[] = new int[10];
		for(int i=0; i<find.length(); i++) {
			for(int y=0; y<10; y++) {
				String num = Integer.toString(y);
				if(find.charAt(i) == num.charAt(0)) {
					count[y] += 1;
				}
			}
		}
		
		for(int i=0; i<10; i++)
			System.out.println(count[i]);
	}
}
