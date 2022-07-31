package src06.exam08;

import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dial = scanner.next();
		int result = 0;
		
		
		for(int i=0; i<dial.length(); i++) {
			for(int x=65; x<91; x++) {
				if(dial.charAt(i) == (char)x) {
					if(x == 90 || x == 89) {
						result += 10;
						break;
					} else if(x == 83) {
						result += 8;
						break;
					} else if( x == 86){
						result += 9;
						break;
					} else {
						result += (x - 65) / 3 + 3;  
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
}
