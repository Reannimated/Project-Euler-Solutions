//Run Time: 2ms
import java.math.BigInteger;

public class p063 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result = 0;
		for (int n = 1; n <= Math.floor(1/(1 - Math.log10(9))); n++) {  //Math.floor(1/(1 - Math.log10(9))) = ~21
			for (int i = 1; i <= 9; i++) {
				if (BigInteger.valueOf(i).pow(n).toString().length() == n)
					result++;
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}

}
