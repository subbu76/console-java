package poc.subbu;

public class MathUtils {

	public static long getFibonacci(int which) {
		if (which <= 0) {
			throw new IllegalArgumentException("invalid argument....");
		}
		
		if (which ==1) {
			return 0;
		} else if (which==2) {
			return 1;
		}
		
		int prev=0, next=1;
		int step = 1;
		while (step<which) {
			int temp = next;
			next = next + prev;
			prev = temp;
			step++;
		}
	
		return next;
		//0,1,1,2,3,5,8
	}
	
	public static void main(String[] args) {
		int i = 7;
		long fibo = getFibonacci(i);
		System.out.println("fibo value in "+ i + " place is " + fibo);
	}
	
}
