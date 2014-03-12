//Run Time: 168ms
import regy.library;
import java.math.BigInteger;

public class p056 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int maxSum = Integer.MIN_VALUE;
		for(int a = 1; a < 100; a++) {
			for(int b = 1; b < 100; b++) {
				BigInteger temp = BigInteger.valueOf(a).pow(b);
				int temp2 = library.sumOfDigits(temp);
				if(temp2 > maxSum)
					maxSum = temp2;
			}
		}
		System.out.println(maxSum);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}

}
