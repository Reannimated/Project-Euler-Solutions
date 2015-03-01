//Run Time: 1ms
import java.math.BigInteger;
import regy.library;
public class p020 {
	public static String run() {
		BigInteger num;
		int result=0;
		num=library.factorial(100);
		String strnum = num.toString();
		for(int i=0;i<strnum.length();i++) {
			result+=Integer.parseInt(strnum.substring(i,i+1));
		}
        return Integer.toString(result);
	}
}
