package numbers;

public class AlternatePrime 
{
	public static void main(String[] args) 
	{
		int start=1;
		int end=10;
		int ct=0;
		int den;
		int alter=0;
		int sum=0;
		int alterSum=0;
		for(int i= start;i<end;i++)
		{
			for( den=2;den<=i;den++)
			{
				if(i%den==0)
				{
					break;
				}
			}
			if(i==den)
			{
				
				ct++;
				sum+=i;
				if(ct%2==0)
				{
					alter++;
					System.out.println(i);
					alterSum+=i;
				}
			}
		}
		System.out.println("No. of prime num= "+ct);
		System.out.println("No of alternat prime numbers= "+alter);
		System.out.println("Sum of prime num= "+sum);
		System.out.println("Sum of alternate prime  num= "+alterSum);
	}
}
