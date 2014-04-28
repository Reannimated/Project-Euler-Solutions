//Run Time: 95ms
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class p099 {

	public static void main(String[] args)throws IOException {
		long start = System.currentTimeMillis();
		Scanner file = new Scanner(new File("/Users/Regy/Programming/Java/Competitions/ProjectEuler/src/p099.txt"));
		int maxRow = 1, maxDigits = 0, row = 1;;
		while(file.hasNext()) {
			int a = file.nextInt();
			int b = file.nextInt();
			int digits = (int) Math.floor(1 + b*Math.log10(a));
			if(digits >= maxDigits) {
				maxDigits = digits;
				maxRow = row;
			}
			row++;
		}
		System.out.println(maxRow);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	
}