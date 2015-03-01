import java.math.BigInteger;
public class p048 {
	public static String run() {
        BigInteger result = new BigInteger("0");
        for (int i=1;i<=1000;i++)
            result = result.add(new BigInteger(Integer.toString(i)).pow(i));
        return result.toString().substring(result.toString().length() - 10, result.toString().length());
	}
}
