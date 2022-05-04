package src03.exam09;
import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=0; i<N; i++) {
			for(int j=1; j<N-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//