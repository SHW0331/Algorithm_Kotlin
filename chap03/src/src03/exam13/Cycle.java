package src03.exam13;
import java.util.Scanner;

public class Cycle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int result = num;
		int count = 0;
		

		do {
			if(num < 10 && 0 <= num) num *= 11;
			else {
				num = (num % 10)*10 + (num % 10 + num /10) % 10;
			}
			count++;
		}while(num != result);
		
		System.out.println(count);	
	}
}
