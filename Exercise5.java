package test;

public class Exercise5 {
	public static void main(String[] args) {
		int[] material=new int[]{1,2,1,2,1,2,2,2};
		for(int i=0;i<material.length;i++) {
			int count=1;
			for(int j=i+1;j<material.length;j++) {
				if(material[i]==material[j]) {
					count++;
				}
			}
			if(count>material.length/2) {
				System.out.println(material[i]);
				break;
			}
		}
	}
}
