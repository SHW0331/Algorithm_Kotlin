package src06.exam09;
import java.util.Scanner;

public class Cro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int word = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.length() >= 2) {
				if( i >= 1) {
					if(str.charAt(i) == '=') {
						if(str.charAt(i-1) == 'c' || str.charAt(i-1) == 's') {
							
						} else if(str.charAt(i-1) == 'z') {
							if(i >= 2 && str.charAt(i-2) == 'd') 
								word--;
						} else
							word++;
					} else if(str.charAt(i) == '-') {
						if(str.charAt(i-1) == 'c' || str.charAt(i-1) == 'd') {
							
						} else
							word++;
					} else if(str.charAt(i) == 'j') {
						if(str.charAt(i-1) == 'l' || str.charAt(i-1) == 'n') {
							
						} else
							word++;
					} else
						word++;
				} else {
					word++;
				}
			} else 
				word++;
		}
		System.out.println(word);
	}
}