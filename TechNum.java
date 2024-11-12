package numbers;

import java.util.Scanner;

import Interface.main;

public class TechNum 
{
	public static int countOfDigits(int num)
	{
		int ct=0;
		for(int i=num;i>0;i/=10)
		{
			ct++;
		}
		System.out.println(ct);
		return ct;
	}
	
	public static int denominator(int num)
	{
		int ct=countOfDigits(num);
		int deno=1;
		if(ct%2==0)
		{
			for(int i=0;i<(ct/2);i++)
			{
				deno*=10;
			}
		}
		System.out.println(deno);
		return deno;
	}
	
	public static  boolean isTech(int num)
	{
		int deno=denominator(num);
		System.out.println(deno);
		System.err.println((num));
		int sum=(num%deno)+(num/deno);
		if((sum*sum)==num)
		{
			System.out.println("Entered num is Tech num");
			return true;
		}
		System.out.println(num+ " is not tech num");
		return false;
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=sc.nextInt();
		System.out.println(isTech(num));
	}
}
