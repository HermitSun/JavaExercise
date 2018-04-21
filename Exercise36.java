package test;

import java.util.*;

public class Exercise36 {

    private static Scanner input;
    
	public static void main(String[] args)  
    {  
		input = new Scanner(System.in);
    	int n=input.nextInt();
    	System.out.println(climbStairs_math(n));
    	System.out.println(climbStairs_dynamic(n));
    }
	
	public static int climbStairs_math(int n) {
		int terms=(int)(n/2)+1;
    	int result=0;
    	for(int i=0;i<terms;i++) {
    		result+=C(n-i*2,n-i);
    	}
    	return result;
	}
    
	public static int climbStairs_dynamic(int n) {
        int re = 0;
        if(n == 0 || n == 1){
            return 1;
        }else{
            re = climbStairs_dynamic(n-1)+climbStairs_dynamic(n-2);
        }
        return re;
    }
	//content below is copied from https://blog.csdn.net/qq_21808961/article/details/77990940
    //求排列数  
    public static int A(int up,int bellow)  
    {  
        int result=1;  
        for(int i=up;i>0;i--)  
        {  
            result*=bellow;  
            bellow--;  
        }  
        return result;  
    }  
    //求组合数，这个也不需要了。定义式，不使用互补率  
    public static int C2(int up,int below)  
    {  
        //分母  
        int denominator=A(up,up);//A(6,6)就是求6*5*4*3*2*1,也就是求6的阶乘  
        //分子  
        int numerator=A(up,below);//分子的排列数  
        return numerator/denominator;  
          
    }  
    public static int C(int up,int below)//应用组合数的互补率简化计算量  
    {  
        int helf=below/2;  
        if(up>helf)  
        {  
            up=below-up;   
        }  
        int denominator=A(up,up);//A(6,6)就是求6*5*4*3*2*1,也就是求6的阶乘  
        //分子  
        int numerator=A(up,below);//分子的排列数  
        return numerator/denominator;  
    }  
}
