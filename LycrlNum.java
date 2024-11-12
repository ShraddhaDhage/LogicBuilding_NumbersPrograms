package Numbers_pgm;

import java.util.Scanner;

public class LycrlNum 
{
	public static int reverse(int num)
	{
		System.out.println(num);
		
		int rev=0;
		System.out.println(rev);
		while(num!=0)
		{
			int last=num%10;
			
			System.out.println(last);
			rev*=10+last;
			
			num/=10;
		}
		return rev;
	}
	
	public static boolean isPalindrome(int num)
	{
		int reverseNum=reverse(num);
		
		if(num==reverseNum)
		{
			return true;
		}
		else
		{
			return false;

		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(reverse(15));
		System.out.println(reverse(num));
		System.out.println(num+reverse(num));
		if(isPalindrome(num+reverse(num)))
		{
			System.out.println("Entered number is lycril");
		}
		else
		{
			System.out.println("Entered num is not lycril");
		}
	}
}
