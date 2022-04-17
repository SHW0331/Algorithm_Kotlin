package src01.exam11;

import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a * (b % 10));
		System.out.println(a * ((b % 100)/10) );
		System.out.println(a * (b / 100));
		System.out.println(a * b);
		
		/* 자연수를 100으로 나눈 뒤 나머지 값에 10으로 
		 나눈 후 몫을 구해 2번째 자리 자연수를 알아냄 */
	}
}
