//Run Time: 0ms
public class p025 {

	public static void main(String[] args) {
		//Using binet's formula: ((phi)^n - (-phi)^-n)/(2^n sqrt(5))
		long start = System.currentTimeMillis();
		double phi = (Math.sqrt(5) + 1) / 2;
		int result = 1;
	    double digits = 1;
	    while(digits < 999) {
	    	result++;
	    	digits = result*Math.log10(phi)+Math.log10(1/Math.sqrt(5));
	    }
	    System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
