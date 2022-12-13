package src02.exam07;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int array[] = {a, b, c};
		int money = 0;
		int result = 0;
		
		if( a==b && a==c) {
			money = 10000 + a * 1000;
			System.out.println(money);
		} else if(a != b && b!=c && a!=c) {
			for(int i=0; i<array.length; i++) {
				if(result <= array[i]) {
					result = array[i];
				}
			}
			money = 100 * result;
			System.out.println(money);
		} else {
			result = a;
			if( result != b && result !=c) {
				result = b;
			}
			money = 1000 + result * 100;
			System.out.println(money);
		}
	}
}

// 같은 눈 3개  --> 10000 + 같은 눈*1000 상금
// 2개 --> 1000 + 같은 눈*100 상금
// 없을때 --> 큰 눈 * 100 상금

// 조건문.. 