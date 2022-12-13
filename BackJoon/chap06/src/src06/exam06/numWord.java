package src06.exam06;

import java.util.Scanner;

public class numWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int count = 0;
		
		for(int i=1; i<str.length()-1; i++) {
			if(str.charAt(i) == ' ') {
				count++;
			} 
		}
		
		if(str.length() == 1 && str.charAt(0) == ' ') {
			System.out.println(0);
		} else {
			System.out.println(count + 1);
		}
	}
}
