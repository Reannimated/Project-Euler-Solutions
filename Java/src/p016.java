//Run Time: 1ms
import java.math.BigInteger;
public class p016 {
	public static String run() {
		int result = 0;
		BigInteger number = BigInteger.valueOf(2);
		number=number.pow(1000);
		String strnum = number.toString();
		for(int i=0;i<strnum.length();i++) {
			result+=Integer.parseInt(strnum.substring(i, i+1));
		}
        return Integer.toString(result);
    }
}
