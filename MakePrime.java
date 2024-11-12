package numbers;

public class MakePrime 
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
	
	public static void makePrime(int num)
	{
		int ct=0;
		for(int i=num+1;;i++ )
		{
			if(isPrime(i))
			{
				System.out.println("Add"+ ct +" to make it prime");
				break;
			}
			else
			{
				++ct;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int num=14;
		int ct=0;
		for(int i=num;;i++)
		{
			if(isPrime(i))
			{
				if(ct==0)
				{
					System.out.println("It is already prime");
					break;
				}
				
				else
				{
					System.out.println("add "+ct +" to make it prime");
					break;
				}
				
			}
			ct++;
		}
	}
}
