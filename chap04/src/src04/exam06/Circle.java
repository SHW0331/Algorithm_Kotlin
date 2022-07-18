package src04.exam06;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int circle = 0;
		int result = 0;
		String ans[] = new String[num];
		
		
		for(int i=0; i<num; i++) {
			ans[i] = scanner.next();
		}
		
		for(int i=0; i<num; i++) {
			for(int y=0; y<ans[i].length(); y++) {
				if(ans[i].charAt(y) == 'O') {
					if(y > 0 && ans[i].charAt(y-1) == ans[i].charAt(y)) {
						circle += 1;
						result += circle + 1;
					} else {
						result += 1;
					}
				} else {
					circle = 0;
				}
			}
			System.out.println(result);
			result = 0;
			circle = 0;
		}
	}
}

/*


*/