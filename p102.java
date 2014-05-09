//Run Time: 258 ms
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p102 {

	public static void main(String[] args) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		int count = 0;
		point p = new point(0,0);
		Scanner file = new Scanner(new File("/Users/Regy/Programming/Java/Competitions/ProjectEuler/src/p102.txt"));
		while(file.hasNext()) {
			point a = new point(file.nextInt(), file.nextInt());
			point b = new point(file.nextInt(), file.nextInt());
			point c = new point(file.nextInt(), file.nextInt());
			if(interiorOrigin(p, a, b, c))
				count++;
		}
		System.out.println(count);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	private static boolean interiorOrigin(point p, point a, point b, point c) {
		double a0 = area(a, b, c), a1 = area(p, a, b), a2 = area(p, b, c), a3 = area(p, a, c);
		if(a1 + a2 + a3 == a0)
			return true;
		return false;
	}
	
	private static double area(point a, point b, point c) {
		double num = (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y));
		return Math.abs(num / 2);
	}

}

class point{
	public int x;
	public int y;
	point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
