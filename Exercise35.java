package test;

public class Exercise35 {
	
	public static void main(String[] args) {
		System.out.println(gcdLoop(1233,3456));
		System.out.println(gcdFactorial(1233,3456));
	}
	
	public static int gcdLoop(int a,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		else {
			if(a>=b) {
				while(b>0) {
					int temp=a;
					a=b;
					b=temp%b;
				}
				return a;
			}
			else {
				while(a>0) {
					int temp=b;
					b=a;
					a=temp%a;
				}
				return b;
			}
		}
	}
	
	public static int gcdFactorial(int a,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		else {
			if(a>=b)
				return gcdFactorial(b,a%b);
			else
				return gcdFactorial(a,b%a);
		}
	}
}
