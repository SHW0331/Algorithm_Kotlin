package src05.exam04;

import java.util.Scanner;

public class oneNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intNum = scanner.nextInt();
		int count = 0;
		
		for(int i=1; i<=intNum; i++) {
			int num = i;
			if(num < 10) {
				count++;
			} else if(num < 100) {
				count++;
			} else {
				if(num / 100 - num % 100 / 10  == num % 100 / 10 - num % 10) {
					count++;
				} else {

				}
			}
		}
		
		if(intNum == 1) {
			System.out.println(count);
		} else
			System.out.println(count);
	}
}
