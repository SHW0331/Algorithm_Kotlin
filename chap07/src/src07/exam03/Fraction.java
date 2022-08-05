package src07.exam03;
import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int front = 1;
		int back = 1;
		int count = 0;

		while (num != count) {
			if (front % 2 != 0 && back % 2 != 0) {
				if (front == 1) {
					if(count != 0) 
						back++;
				} else if(back == 1) {
					front -= 1;
					back += 1;
				} else {
					front -= 1;
					back += 1;
				}
			} else if (front % 2 == 0 && back % 2 != 0) {
				if (back == 1)
					front++;
				else {
					front += 1;
					back -= 1;
				}
			} else if (front % 2 != 0 && back % 2 == 0) {
				front += 1;
				back -= 1;
			} else {
				front -= 1;
				back += 1;
			}
			count++;
		}
		System.out.println(front + "/" + back);
	}
}