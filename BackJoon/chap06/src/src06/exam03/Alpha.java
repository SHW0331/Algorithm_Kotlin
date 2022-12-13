package src06.exam03;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int[] count = new int[26];
		int result = -1;
		
		for(int i=0; i<count.length; i++) {
			count[i] = -1;
		}
		
		for(int i=0; i<str.length(); i++) {
			for(int y=0; y<26; y++) {
				char ascii = (char)(y+97);
				if(str.charAt(i) == ascii) {
					result +=1;
					if(count[y] != -1) {
						
					}else
						count[y] = result;
				}
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(i == count.length-1)
				System.out.print(count[i]);
			else
				System.out.print(count[i] + " ");
		}
	}
}
