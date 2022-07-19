package src04.exam07;
import java.util.Scanner;

public class Over {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double arr[] = new double[num];
		
		double result = 0;
		double count = 0;
		double avg = 0;
				
		for(int i=0; i<num; i++) {
			int stuNum = scanner.nextInt();
			int score[] = new int[stuNum];
			for(int y=0; y<stuNum; y++) {
				score[y] = scanner.nextInt();
				result += score[y];
			}
			
			avg = result / stuNum;
			for(int y=0; y<stuNum; y++) {
				if(score[y] > avg)
					count++;
			}
			
			arr[i] = (count  / stuNum) * 100;
			count = 0;
			result = 0;
		}
		
		for(int i=0; i<num; i++) {
			double avgNum = arr[i];
			double trans = Math.round(avgNum*1000)/1000.0;
			System.out.println(String.format("%.3f", trans) + "%");
		}
	}
}
