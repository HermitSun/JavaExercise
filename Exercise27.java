package test;

public class Exercise27 {
	public static void main(String[] args) {
		char[] data=new char[] {'b','c','a','b','c','a'};
		System.out.println(singleCharacter(data));
	}
	public static char singleCharacter(char[] data) {
		for(int i=0;i<data.length;i++) {
			boolean flag=false;
			for(int j=0;j<data.length;j++) {
				if((i!=j)&&(data[i]==data[j])) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				return data[i];
			}
		}
		return '\0';
	}
}
