//Run Time: 0ms
public class p017 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int onetonine=36;
		int tentonineteen = 70;
		int twentytoninety = 46;
		int hundred = 7;
	    int thousand = 8;
	    int result=(9*hundred+onetonine)+((hundred+3)*99*9)+(99*36)+10*(onetonine+tentonineteen+(twentytoninety*10)+(onetonine*8))+3+thousand;
	    System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
}
