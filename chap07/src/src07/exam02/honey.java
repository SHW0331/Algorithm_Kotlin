package src07.exam02;

import java.util.Scanner;

public class honey {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      int num = scanner.nextInt();
	      int result = 0;

	      for (int i = 0; i < num; i++) {
	         String str = scanner.next();
	         int arr[] = new int[26];
	         int check = 0;

	         for (int y = 0; y < str.length(); y++) {
	            if (str.length() == 1) {
	               check++;
	               break;
	            } else if (y == str.length() - 1) {
	               if (str.charAt(y) == str.charAt(y - 1)) {

	               } else {
	                  for (int x = 97; x < 123; x++) {
	                     if (str.charAt(y) == (char) x) {
	                        arr[x - 97] += 1;
	                     }
	                  }
	               }
	            } else { //
	               for (int x = 97; x < 123; x++) {
	                  if (str.charAt(y) == (char) x) {
	                     if (str.charAt(y) == str.charAt(y + 1)) {

	                     } else {
	                        arr[x - 97] += 1;
	                     }
	                  }
	               }
	            }

	            for (int k = 0; k < arr.length; k++) {
	               if (arr[k] > 1) {
	                  check = 0;
	                  break;
	               } else
	                  check = 1;
	            }
	         }
	         result += check;
	      }
	      System.out.println(result);
	}

}
