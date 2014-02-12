import java.math.BigInteger;

public class p048 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		BigInteger result = BigInteger.ZERO;
		for(int x=1;x<=10;x++)
		{
			result.add(BigInteger.valueOf(x).pow(x));
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
