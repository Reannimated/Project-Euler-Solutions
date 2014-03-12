
public class p085 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		final int celing = 2000000;
		int area = Integer.MIN_VALUE, diff = Integer.MAX_VALUE;
		for(int n = 1; n < Math.sqrt(celing); n++) {
			for(int m = 1; m < Math.sqrt(celing); m++) {
				int temp = Math.abs(rectangles(n,m) - celing);
				if(temp < diff) {
					diff = temp;
					area = n * m;
				}
			}
		}
		System.out.println(area);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	private static int rectangles(int n, int m) {
		return (m*(m+1)*(n)*(n+1))/4;
	}
}
