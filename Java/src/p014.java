//Run Time: 30ms
public class p014 {
	public static String run() {
		long result=0, maxchain=0, num;
		int n=1000000;
		long[] cache = new long[n+1];
		cache[1]=1;
		for (int i = 2; i < n; i++) {
			num = i;
			int chain = 0;
			while (num != 1 && num >= i) {
				if (num % 2 == 0) 
					num/=2;
				else 
					num = num * 3 + 1;
				chain++;
			}
			cache[i] = chain + cache[(int) num];
			if (cache[i] > maxchain) {
				maxchain = cache[i];
				result = i;
			}
		}
        return Long.toString(result);
    }
}
