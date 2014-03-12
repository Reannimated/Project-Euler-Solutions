//Run Time: 1ms
import java.math.BigInteger;

public class p097 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		BigInteger mod = BigInteger.TEN.pow(10);
		BigInteger num1 = new BigInteger("28433");
		BigInteger base = BigInteger.valueOf(2);
		BigInteger exp = new BigInteger("7830457");
		BigInteger num2 = base.modPow(exp,mod);
		BigInteger num3 = num1.multiply(num2);
		BigInteger num4 = num3.mod(mod);
		BigInteger result = num4.add(BigInteger.ONE);
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - start + " ms");

	}

}
