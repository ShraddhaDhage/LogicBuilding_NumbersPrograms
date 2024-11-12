package numbers;


public class TakeRaise 
{
	public static int power(int num,int raise)
	{
		int pow=1;
		for(int i=0;i<raise;i++)
		{
			pow*=num;
		}
		return pow;
	}
	
	
	
	public static void main(String[] args)
	{
		int base=2;
		int raise=5;
		System.out.println(power(base, raise));		
	}
}
