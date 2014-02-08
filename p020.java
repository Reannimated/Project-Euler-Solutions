//Run Time: 1ms
import library.library;
import java.math.BigInteger;
public class p020 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		BigInteger num;
		int result=0;
		num=library.factorial(100);
		String strnum = num.toString();
		for(int i=0;i<strnum.length();i++) {
			result+=Integer.parseInt(strnum.substring(i,i+1));
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
