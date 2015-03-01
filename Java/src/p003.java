//Run Time: 0ms
public class p003 {
	public static String run() {
		long number = 600851475143L;
		int i = 0;
		for (i = 2; i <= number; i++) {
			if (number % i == 0) {
				number /= i;
				i--;
			}
		}
		return Integer.toString(i);
	}
}
