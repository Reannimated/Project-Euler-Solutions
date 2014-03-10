//Run Time: 193ms
import regy.library;
public class p043 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		long result=0;
		while(library.hasNextPermutation(num)) {
			if(isDivisible(num))
				result+= toInteger(num,0,10);
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	
	private static boolean isDivisible(int[] n) {
		int[] tests = {2,3,5,7,11,13,17};
		for(int i=0;i<tests.length;i++) {
			if(toInteger(n,i+1,3) % tests[i] != 0)
				return false;
		}
		return true;
	}
	
	private static long toInteger(int[] digits, int off, int len) {
		long result = 0;
		for (int i = off; i < off + len; i++)
			result = result * 10 + digits[i];
		return result;
	}
}
