package src03.exam01;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i=1; i<10; i++) {
			int result = num * i;
			System.out.println(num + " * " + i + " = " + result);
		}
	}

}
