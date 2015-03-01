//Run Time: 203ms
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import regy.library;

public class p062 {
    public static String run() {
        /*
        Idea loop through all reasonable n(3000 - 6000 for right now)
        compute the cubes, sort the digits put them in a hashmap as the key
        for the value its how many times a cube is those sorted digits
        when the value is ever 5 return the key
        gg
         */
        HashMap<String, Integer> cubes = new HashMap<String, Integer>();
        for(int i = 3000; i < 6000; i++) {
            BigInteger n = BigInteger.valueOf(i);
            BigInteger cubed = karatsuba(n, karatsuba(n, n));
            String sorted = sortNum(cubed.toString());
            if(cubes.containsKey(sorted)) {
                int value = cubes.get(sorted);
                if(value == 4) {
                    System.out.println(sorted);
                }
                else
                    cubes.put(sorted, value + 1);
            }
            else
                cubes.put(sorted, 1);
        }
        return null;
    }

    private static String sortNum(String n) {
        char[] ar = n.toCharArray();
        Arrays.sort(ar);
        return String.valueOf(ar);
    }

    private static BigInteger karatsuba(BigInteger x, BigInteger y) {

        // cutoff to brute force
        int N = Math.max(x.bitLength(), y.bitLength());
        if (N <= 2000) return x.multiply(y);                // optimize this parameter

        // number of bits divided by 2, rounded up
        N = (N / 2) + (N % 2);

        // x = a + 2^N b,   y = c + 2^N d
        BigInteger b = x.shiftRight(N);
        BigInteger a = x.subtract(b.shiftLeft(N));
        BigInteger d = y.shiftRight(N);
        BigInteger c = y.subtract(d.shiftLeft(N));

        // compute sub-expressions
        BigInteger ac    = karatsuba(a, c);
        BigInteger bd    = karatsuba(b, d);
        BigInteger abcd  = karatsuba(a.add(b), c.add(d));

        return ac.add(abcd.subtract(ac).subtract(bd).shiftLeft(N)).add(bd.shiftLeft(2*N));
    }
}
