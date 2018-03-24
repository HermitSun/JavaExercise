package test;

public class Exercise13 {
	public static void main(String[] args) {
		int[] test=new int[5];
		for(int i=0;i<test.length;i++) {
			test[i]=i;
		}
		for(int i=test.length-1;i>=0;i--) {
			if(i==test.length-1) {
				System.out.print("{"+test[i]+",");
			}
			else if(i==0) {
				System.out.print(test[i]+"}");
			}
			else {
				System.out.print(test[i]+",");
			}
		}
	}
}
