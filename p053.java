//Run Time: 137ms
import regy.library;
import java.math.BigInteger;

public class p053 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result = 0;
		for(int n = 0; n <= 100; n++) {
			for(int r = 0; r <=n; r++) {
				if(library.combination(n, r).compareTo(BigInteger.valueOf((long) Math.pow(10, 6))) > 0)
					result++;
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
}
