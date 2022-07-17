package src04.exam05;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double arr[] = new double[num];
		double max = 0;
		double avg = 0;
		double result = 0;
		
		for(int i=0; i<num; i++) {
			arr[i] = scanner.nextInt();
			if(max <= arr[i])
				max = arr[i];
		}
		
		for(int i=0; i<num; i++) {
			avg = (arr[i] / max) * 100;
			result += avg;
		}
		System.out.println(result / num);
	}

}
