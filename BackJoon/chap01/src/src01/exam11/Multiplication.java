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
		
		/* �ڿ����� 100���� ���� �� ������ ���� 10���� 
		 ���� �� ���� ���� 2��° �ڸ� �ڿ����� �˾Ƴ� */
	}
}
