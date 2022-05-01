package src03.exam06;
import java.util.Scanner;
public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int array[][] = new int[num][2];
		for(int i=0; i<num; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			array[i][0] = A;
			array[i][1] = B;
		}
		for(int i=0; i<num; i++) {
			System.out.println("Case #" + (i+1) + ": " + (array[i][0] + array[i][1]));
		}
	}

}
