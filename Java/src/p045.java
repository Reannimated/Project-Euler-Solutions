//Run Time: 2ms
public class p045 {
	public static String run() {
		long result=0;
        int i = 143;
        //Since all hexagonal numbers are also triangular numbers, we simply need to iterate 
        //though the hexagonal numbers until one of them is a pentagonal number
        while (true) {
            i++;
            result = i * (2 * i - 1);

            if (isPentagonal(result)) {
                break;
            }                    
        }
        return Long.toString(result);
	}
	
	private static boolean isPentagonal(long result) {
		double isPent = (Math.sqrt(1 + 24 * result) + 1) / 6;
		return isPent == ((int)isPent);
	}
}
