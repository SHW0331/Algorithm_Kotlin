package src03.exam12;
import java.util.Scanner;

public class Min4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				int A = scanner.nextInt();
				int B = scanner.nextInt();
				int result = A + B;
				System.out.println(result);
			}
		} catch(NullPointerException n) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			scanner.close();
		}
	}

}
