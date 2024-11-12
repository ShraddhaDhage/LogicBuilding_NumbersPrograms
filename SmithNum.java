package numbers;

public class SmithNum 
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
	
	public static boolean isPrime(int num)
	{
		int den;
		for(den=2;den<=num;den++)
		{
			if(num%den==0)
			{
				break;
			}
		}
		if(num==den)
		{
			return true;
		}
		return false;
	}
	
	public static int sumOfPrimeFactors(int num)
	{
		int sumOfPrimeFact=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				if(isPrime(i))
				{
					sumOfPrimeFact+=sumOfDigits(i);
				}
			}
		}
		return sumOfPrimeFact;
		
	}
	
	public static boolean isSmith(int num)
	{
		if(sumOfDigits(num)==sumOfPrimeFactors(num))
		{
			System.out.println("Entered num "+num +" is Smith num");
			return true;
		}
		System.out.println("Entered num "+num +" is  not Smith num");
 
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(isSmith(75));
	}
}
