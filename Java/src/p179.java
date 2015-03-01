//Run Time: 1432ms
public class p179 {

	public static String run() {
		int limit = (int)Math.pow(10, 7), result = 0;
		int[] factors = new int[limit];
		factors[1] = Integer.MIN_VALUE; 
		for(int i=2;i<limit;i++) {
			for(int j=2;i*j<limit;j++) {
				factors[i*j]++;
			}
			if(factors[i] == factors[i-1])
				result++;
		}
		return Integer.toString(result);
	}
}
