package test;

public class Exercise31 {
	public static void main(String[] args) {
		String test="AAaaa";
		System.out.println(detectCaptial_char(test));
		System.out.println(detectCaptital_regular(test));
	}
	
	public static boolean detectCaptial_char(String src) {
		char[] temp=new char[src.length()];
		for(int i=0;i<src.length();i++) {
			temp[i]=src.charAt(i);
		}
		if(temp.length==0) {
			return true;
		}else if(Character.isUpperCase(src.charAt(0))){
			return judgeLower(temp);
		}else if(Character.isLowerCase(src.charAt(0))){
			return judgeLower(temp);
		}else {
			return false;
		}
	}
	
	public static boolean judgeLower(char[] data) {
		for(int i=1;i<data.length;i++) {
			if(Character.isUpperCase(data[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean detectCaptital_regular(String src) {
		if(src.matches("[a-z]*")||src.matches("[A-Z]*")||src.matches("[A-Z]{1}[a-z]+")) {
			return true;
		}else {
			return false;
		}
	}
}
