package src06.exam06;

import java.util.Arrays;

public class numWord {

	public static void main(String[] args) {
		String Word = "string";
		int y = 115;
		char ch = (char)y;
		System.out.println(Word.charAt(2));
		System.out.println(ch);
		
		int arr[] = new int[26];
		Arrays.fill(arr, 0);
		
		if(Word.charAt(0) == (char)y)
			System.out.println("Âü");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
