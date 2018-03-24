package test;

import java.io.*;

public class Exercise12_2 {
	public static void main(String[] args) {
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String a=br.readLine();
			String b=br.readLine();
			br.close();
			int c=Integer.parseInt(a);
			int d=Integer.parseInt(b);
			System.out.printf("加数：%d 被加数：%d 和：%d",c,d,c+d);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
