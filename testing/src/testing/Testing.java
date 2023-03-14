package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Testing {

	public static void main(String[] args) {
		System.out.println("testing을 implemnet로 변경");
		// TODO Auto-generated method stub
		File file = new File("C:\\problem\\testing.txt.txt");
		try {
			String arr[] = new String[99];
			
			int word = 0;
			int lineNum = 0;
			int count = 0;
			String txt = "";
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				txt += line;
				if(line == null) {
					break;
				}else { 
					String change = line.replaceAll("testing", "implement");
					System.out.println(change);
				}
			}
			
			// 총 testing 단어
			for(int i=0; i<txt.length(); i++) {
			    if(txt.charAt(i) == 't' && txt.charAt(i+1) == 'e' && txt.charAt(i+2) == 's' && txt.charAt(i+3) == 't'
			            && txt.charAt(i+4) == 'i' && txt.charAt(i+5) == 'n' && txt.charAt(i+6) == 'g') {
			        count++;
			    }
			    
			    if(txt.charAt(i) == 'T' && txt.charAt(i+1) == 'e' && txt.charAt(i+2) == 's' && txt.charAt(i+3) == 't'
			            && txt.charAt(i+4) == 'i' && txt.charAt(i+5) == 'n' && txt.charAt(i+6) == 'g') {
			        count++;
			    }
			}
			
			// 총 단어
			for(int i=0; i<txt.length(); i++) {
			    if(txt.charAt(i) == ' ') {
			        word++;
			    }
			}
			
			// 총 문장
			for(int i=0; i<txt.length(); i++) {
			    if('.' == txt.charAt(i)) lineNum++;
			}
			
			System.out.println("총 단어 개수: " + word);
			System.out.println("총 문장 개수: " + lineNum + " (.으로 끝나는 문장만 취급) ");
			System.out.println("총 testing 단어 개수 : " + count);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
