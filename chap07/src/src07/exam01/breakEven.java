package src07.exam01;

import java.util.Scanner;

public class breakEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int result = 0;
		
		if(C-B > 0 && A != 0 && C !=0 && B !=0)
			result = A / (C-B) + 1;
		else
			result = -1;
		
		System.out.println(result);
	}
}
