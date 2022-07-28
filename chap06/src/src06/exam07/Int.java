package src06.exam07;

import java.util.Scanner;
public class Int {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int max = 0;
		
		int renum1 = 0;
		int renum2 = 0;
		
		renum1 = (num1 % 10 * 100) + (num1 % 100 / 10 * 10) + (num1 / 100);
		renum2 = (num2 % 10 * 100) + (num2 % 100 / 10 * 10) + (num2 / 100);
		
		if(renum1 > renum2) 
			max = renum1;
		else
			max = renum2;
		System.out.println(max);
	}
}
