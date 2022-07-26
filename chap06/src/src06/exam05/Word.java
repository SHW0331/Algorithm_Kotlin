package src06.exam05;

import java.util.Arrays;
import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Word = scanner.next();
		int arr[] = new int[26];
		Arrays.fill(arr, 0);
		int max = 0;
		int result =0;
		int check = 0;
		
		for(int i=0; i<Word.length(); i++) {
			for(int y=65; y<91; y++) {
				if(Word.charAt(i) == (char)y || Word.charAt(i) == (y+32)) {
					arr[y-65]++;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				result = i;
			} else if(max == arr[i] && max > 0) {
				check = arr[i];
			}
		}
		
		if(max == check)
			System.out.println((char)(63));
		else
			System.out.println((char)(result+65));
	}
}
