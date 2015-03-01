////Run Time: 95ms
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class p099 {

	public static String run() throws IOException {
        Scanner file = new Scanner(new File("/Users/regynald/Programming/SideProjects/ProjectEuler/src/p099.txt"));
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
		return Integer.toString(maxRow);
	}

}