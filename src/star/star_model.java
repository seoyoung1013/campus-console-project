package star;

import java.util.Scanner;

public class star_model {
	
	public int setScanner() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	public String makeStar(int step) {
		String str = "";
		for(int i = 1; i<=step; i++) {
			for(int j=0; j<i;j++) {
				str += "*";
			}
				str +='\n';
		}
		return str;
	}
	

}
