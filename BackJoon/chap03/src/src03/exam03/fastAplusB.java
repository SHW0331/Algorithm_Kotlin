package src03.exam03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class fastAplusB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer sn;
		int num =  Integer.parseInt(br.readLine());
		
		for(int i=1; i<=num; i++) {
			sn = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(sn.nextToken())+Integer.parseInt(sn.nextToken()))+"\n");
		}
		bw.close();
	}
}
