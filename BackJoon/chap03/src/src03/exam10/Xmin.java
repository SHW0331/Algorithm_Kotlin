package src03.exam10;
import java.util.Scanner;

public class Xmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		
		int array[] = new int[N];
		for(int i=0; i<N; i++) {
			array[i] = scanner.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(array[i] < X) {
				System.out.print(array[i] +" ");
			}
		}
	}
}
