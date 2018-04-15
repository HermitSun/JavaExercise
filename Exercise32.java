package test;

public class Exercise32 {
	public static void main(String[] args) {
		System.out.println(hammingDistance(4,2));
	}
	public static int hammingDistance(int a,int b) {
		String a_binary=Integer.toBinaryString(a);
		String[] a_temp=a_binary.split("");
		String b_binary=Integer.toBinaryString(b);
		String[] b_temp=b_binary.split("");
		int count=0;
		for(int i=0;i<Math.min(a_temp.length, b_temp.length);i++) {
			if(a_temp[i]!=b_temp[i]) {
				count++;
			}
		}
		count+=Math.abs(Math.min(a_temp.length, b_temp.length)-a_temp.length);
		return count;
	}
}
