//Run Time: 0ms
public class p028 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result = 1001*1001;
		int counter = 0, i = 1000,num = 1001*1001;
		do{
			num-=i;
			result+=num;
			counter++;
			if(counter == 4){
				counter=0;
				i-=2;
			}
		}while(i>0&&counter<4);
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
