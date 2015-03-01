//Run Time: 791ms
public class p092 {

	private static int limit = (int) Math.pow(10, 7);

	public static String run() {
		int[] cache = new int[limit];
		cache[0] = 1;
		cache[1] = 1;
		for(int i = 1; i < limit; i++) {
			int n = i;
			while(n != 1 && n != 89) {
				n = squareOfDigits(n);
				if(n < i) {
					n = cache[n];
					break;
				}
			}
			cache[i] = n;
		}
		int result = 0;
		for(int i : cache) {
			if(i == 89)
				result++;
		}
		return Integer.toString(result);
	}

	private static int squareOfDigits(int num) {
		int sum = 0;
		while (num != 0)
		{
			sum += Math.pow((num%10),2);
			num /= 10;
		}
		return sum;
	}
}
