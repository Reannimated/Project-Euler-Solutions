//Run Time: 14ms
public class p085 {

	public static String run() {
		long start = System.currentTimeMillis();
		final int ceiling = 2000000;
		int area = Integer.MIN_VALUE, diff = Integer.MAX_VALUE;
		for(int n = 1; n < Math.sqrt(ceiling); n++) {
			for(int m = 1; m < Math.sqrt(ceiling); m++) {
				int temp = Math.abs(rectangles(n,m) - ceiling);
				if(temp < diff) {
					diff = temp;
					area = n * m;
				}
			}
		}
		return Integer.toString(area);
	}

	private static int rectangles(int n, int m) {
		return (m*(m+1)*(n)*(n+1))/4;
	}
}
