package test;

public class Exercise19 {
	public static void main(String[] args) {
		String s="Hello World";
		char[] content=s.toCharArray();
		for(char c:content) {
			System.out.print(c);
		}
		System.out.println();
		for(int i=0;i<content.length;i++) {
			System.out.print(content[i]);
		}
	}
}
