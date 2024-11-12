package numbers;

public class PrimeDigits 
{
	public static void main(String[] args) 
	{
		int num=12345;
		int den;
		for(int i=num;i>0;i/=10)
		{
			int last=i%10;
			System.out.println(last);
			for( den=2;den<=i;den++)
			{
				if(i%den==0)
				{
					break;
				}
				System.out.println("------");
			}
			if(i==den)
			{
				System.out.println("Prime digit: "+last);
			}
		}
	}
}
