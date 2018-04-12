package test;

public class Exercise24 {
	public static void main(String[] args) {
		int[] data=new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		System.out.println(arrayToInteger(data));
	}
	public static int arrayToInteger(int[] data) {
		int count=data.length;
		int start=0;
		int result=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]==0) {
				count--;
			}
			else {
				start=i;
				break;
			}
		}
		for(;start<data.length;start++) {
			int adder=data[start]*pow(10,--count);
			if((result>0)&&(adder>0)&&(result+adder<0)) {
				return Integer.MAX_VALUE;
			}
			else {
				result+=adder;
			}
		}
		return result;
	}
	public static int pow(int m, int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=m;
		}
		return result;
	}
}
