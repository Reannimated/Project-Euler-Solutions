//Run Time: 43ms
public class p005 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=20;
		while(result % 11 != 0 ||result % 13 != 0 ||result % 14 != 0 ||result % 15 != 0 ||
			  result % 16 != 0 ||result % 17 != 0 || result % 18 != 0 || result % 19 != 0 ) {
				result+=20;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
