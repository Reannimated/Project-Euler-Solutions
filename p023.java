
public class p023 {

	public static void main(String[] args) {
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
		System.out.println(sum);
		System.out.println(System.currentTimeMillis()-start+"ms");
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
