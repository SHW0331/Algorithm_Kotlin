package src05.exam02;

import java.util.Scanner;

public class selfNum {

	public static void main(String[] args) {
		int num = 10000;
		int result = 0;
		int[] arr = new int[num];
		int[] count = new int[num];

		
		for(int i=0; i<num; i++) {
			if(i < 10) 
				result = i + i;
			else if(i < 100)
				result = i + (i / 10) + (i % 10);
			else if(i < 1000)
				result =  i + (i / 100 ) + (i % 100 / 10) + (i % 10);
			else  if(i < 10000)
				result =  i + (i / 1000) + (i % 1000 / 100 ) + (i % 100 / 10)  + (i % 10);
			
			arr[i] = result;
		}
		
		for(int i=1; i<num; i++) {
			for(int y=1; y<num; y++) {
				if(arr[i] == y)
					count[y] = y;
			}	
			if(count[i] == 0)
			System.out.println(i);
		}
	}
}
