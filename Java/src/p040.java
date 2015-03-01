//Run Time: 71ms
public class p040 {

	public static String run() {
		int result=1;
		StringBuilder d = new StringBuilder();
		for (int i = 1; i < 1000000; i++)
			d.append(i);
		for(int j = 1; j <= 1000000; j*=10) {
			result*=Integer.parseInt(d.substring(j-1, j));
		}
        return Integer.toString(result);
	}

}
