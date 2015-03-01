//Run Time: 498ms
public class p030 {
	public static String run() {
		int result=0;
		int num;
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				for(int c=0;c<10;c++){
					for(int d=0;d<10;d++){
						for(int e=0;e<10;e++){
							for(int f=0;f<10;f++){
								num = (a*100000)+(b*10000)+(c*1000)+(d*100)+(e*10)+f;
								if(num==(Math.pow(a,5)+Math.pow(b,5)+Math.pow(c,5)+Math.pow(d,5)+Math.pow(e,5)+Math.pow(f,5))){
									result+=num;
								}
							}
						}	
					}	
				}	
			}
		}
		return Integer.toString(result-1);
	}

}
