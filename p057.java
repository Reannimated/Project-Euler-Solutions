//Run Time: 153ms
import java.math.BigInteger;

public class p057 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int limit = 1000, result = 0;
		BigInteger n = BigInteger.ONE;
		BigInteger d = BigInteger.ONE;
		for(int i = 0; i < limit; i++) {
			BigInteger td = n.add(d);
			BigInteger tn = td.add(d);
			if(tn.toString().length() > td.toString().length())
				result++;
			n = tn;
			d = td;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}

}
