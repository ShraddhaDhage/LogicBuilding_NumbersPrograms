package numbers;

public class NeonNum 
{
	public static void main(String[] args) 
	{
		int num=6;
		int sq=num*num;
		
		int sum=0;
		for(int i=sq;i>0;i/=10)
		{
			sum+=i%10;
		}
		
		if(sum==num)
		{
			System.out.println("It is neon num");
		}
		
		else
		{
			System.out.println("It is not neon num");
		}
	}
}
