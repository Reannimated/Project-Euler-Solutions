//Run Time: 25ms
import java.util.Calendar;
public class p019 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Calendar date = Calendar.getInstance();
		int result=0;
		for(int year=1901;year<=2000;year++) {
			for(int month=1;month<=12;month++) {
				date.set(year, month, 1);
				if(date.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
					result++;
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
