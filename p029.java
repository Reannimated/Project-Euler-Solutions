//Run Time: 36ms
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class p029 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Set<BigInteger> num = new HashSet<BigInteger>();
		for(int a=2;a<=100;a++){
			for(int b=2;b<=100;b++){
				num.add(BigInteger.valueOf(a).pow(b));
			}
		}
		System.out.println(num.size());
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
