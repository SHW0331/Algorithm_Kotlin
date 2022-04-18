package src02.exam02;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		
		if(90 <= grade && 100 >= grade) {
			System.out.println("A");
		} else if(80 <= grade && 90 > grade) {
			System.out.println("B");
		} else if(70 <= grade && 80 > grade) {
			System.out.println("C");
		} else if(60 <= grade && 70 > grade) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
