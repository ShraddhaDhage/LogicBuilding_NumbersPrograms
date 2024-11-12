package numbers;

public class TwinPrime 
{
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
	
	public static void main(String[] args) 
	{
		int start=0;
		int end=100;
		
		for(int i=start;i<end;i++)
		{
			if(isPrime(i))
			{
				if(isPrime(i+1))
				{
					System.out.println(i +" & "+ (i+1)+" are twin prime" );
				}
				
				else if(isPrime(i+2))
				{
					System.out.println(i +" & "+ (i+2)+" are twin prime" );
				}
				
			}
			
		}
				
	}
			
		
		
		
		
	
	
	
}
