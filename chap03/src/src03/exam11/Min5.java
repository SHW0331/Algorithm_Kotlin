package src03.exam11;
import java.util.Scanner;

public class Min5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i=0;
		
		while(true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int result = A + B;
			
			if(result == 0) {
				break;
			} else {
				System.out.println(result);
			}
		}	
	}
}
