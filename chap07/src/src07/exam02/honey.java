package src07.exam02;

import java.util.Scanner;

public class honey {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int door = 1;
        int d = 0;
        
        while(num > door) {
            door = door + 6*d;
            d++;
        }
        if(num == 1) {
            d = 1;
        }
        System.out.println(d);
	}

}
