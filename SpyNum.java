package numbers;

public class SpyNum 
{
	public static int sumOfDigits(int num)
	{
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			sum+=i%10;
		}
		return sum;
	}
	
	public static int productOfDigits(int num)
	{
		int prod=1;
		for(int i=num;i>0;i/=10)
		{
			prod*=i%10;
		}
		return prod;
	}
	
	public static boolean isSpy(int num)
	{
		
		if(sumOfDigits(num)==productOfDigits(num))
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) 
	{
		System.out.println(isSpy(1234));
	}
}
