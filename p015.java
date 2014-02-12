//Run Time: 1ms
import java.math.BigInteger;

import regy.library;

public class p015 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n=40, r=20;
		System.out.println(combination(n,r));
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	
	//Lattice Paths on a nxm grid can be written as n+mCn where C is a combination formula denoted by n!/r!(n-r)!
	private static BigInteger combination(int n, int r) {
		BigInteger ncr = library.factorial(n).divide(library.factorial(r).multiply(library.factorial(n-r)));
		return ncr;
	}
	
}
