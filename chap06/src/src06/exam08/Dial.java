package src06.exam08;

import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dial = scanner.next();
		int uni = 65;
		int count = 3;
		int result = 0;
		
		for(int i=0; i<dial.length(); i++) {
			for(int y=2; y<10; y++) {
				for(int x=65; x<91; x++) {
					if(dial.charAt(i) == (char)x) {
						result += (x - 65) / 3 + 3;  
						break;
					}
				}
	
			}
		}
		
		System.out.println(result);
	}
}
