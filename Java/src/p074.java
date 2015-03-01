//Run Time: 2637ms
import java.util.ArrayList;
public class p074 {
	public static String run() {
		int count = 0;
		ArrayList<Integer> values = new ArrayList<Integer>();
		for(int i = 0; i < 1000000; i++) {
			int n = i;
			while(!values.contains(n)) {
				values.add(n);
				n = sumOfDigits(n);
			}
			if(values.size() == 60)
				count++;
			values.clear();
		}
		return Integer.toString(count);
	}

	private static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0)
		{
			sum += factorial(n % 10);
			n /= 10;
		}
		return sum;
	}

	private static int factorial(int n) {
		if(n == 1)
			return 1;
		else if(n == 2)
			return 2;
		else if(n == 3)
			return 6;
		else if(n == 4)
			return 24;
		else if(n == 5)
			return 120;
		else if(n == 6)
			return 720;
		else if(n == 7)
			return 5040;
		else if(n == 8)
			return 40320;
		else if(n == 9)
			return 362880;
		else
			return 1;
	}
}
