package src02.exam06;
import java.util.Scanner;

public class Oven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		int time = scanner.nextInt();
		if(M + time >= 60 ) {
			H += 1;
			M = (M + time) - 60;
			while(true) {
				if(M >= 60 ) {
					H += 1;
					M -= 60;
					if(H >= 24) {
						H = 0;
					}
				} else {
					break;
				}
			}
			
			if(H >= 24) {
				H = 0;
				System.out.println(H + " " + M);
			} else {
				System.out.println(H + " " + M);
			}
		} else {
			M += time;
			System.out.println(H + " " + M);
		}
	}
}
