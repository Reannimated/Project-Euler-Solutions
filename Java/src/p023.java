//Run Time: 40ms
public class p023 {
	public static String run() {
		long start = System.currentTimeMillis();
		boolean[] abundantNums = new boolean[28123+1];
		int sum=0;
		for(int i=1;i<abundantNums.length;i++) {
			abundantNums[i]=isAbundant(i);
		}
		for(int i=1;i<=28123;i++) {
			if(!isSumOf(abundantNums,i)) {
				sum+=i;
			}
		}
        return Integer.toString(sum);
	}

	private static boolean isSumOf(boolean[] abundantNums,int n) {
			for (int i = 0; i <= n; i++) {
				if (abundantNums[i] && abundantNums[n - i])
					return true;
			}
			return false;
	}
	
	private static boolean isAbundant(int n) {
		int sum = 1;
		int sqr = (int)Math.sqrt(n);
		for (int i = 2; i <= sqr; i++) {
			if (n % i == 0)
				sum += i + n / i;
		}
		if (sqr * sqr == n)
			sum -= sqr;
		return sum > n;
	}
}
