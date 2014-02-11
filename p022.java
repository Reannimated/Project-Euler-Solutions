import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;


public class p022 {

	public static void main(String[] args)throws IOException {
		long start = System.currentTimeMillis();
		Scanner file = new Scanner(new File("/Users/Regy/Programming/Java/ProjectEuler/src/p022.txt"));
		String[] names = new String[5163];
		int sum=0;
		for(int i=0;file.hasNext();i++) {
			names[i]=file.next();
		}
		file.close();
		Arrays.sort(names);
		for(int j=0;j<names.length;j++) {
			sum+=(j+1)*nameScore(names[j]);
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	
	private static int nameScore(String name) {
		int score=0;
		for(int j=0;j<name.length();j++) {
			score+=name.charAt(j)-64;
		}
		return score;
	}
}