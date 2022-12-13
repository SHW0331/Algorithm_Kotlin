package src02.exam05;
import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if( M - 45 >= 0 ) {
			M -= 45;
			System.out.println(H + " " + M);
		} else {
			if(H - 1 < 0) {
				H = 23;
				if (M - 45 < 0 ) {
					M = (M + 15);
				} else {
					M -= 45;
				}
				System.out.println(H + " " + M);
			} else {
				H -= 1;
				if (M - 45 < 0 ) {
					M = (M + 15);
				} else {
					M -= 45;
				}
				System.out.println(H + " " + M);
			}
		}
	}

}
