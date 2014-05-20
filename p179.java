//Run Time: 1432ms
public class p179 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
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
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}

}
