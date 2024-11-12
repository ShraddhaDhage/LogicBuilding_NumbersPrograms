package numbers;

public class StrongNum 
{
	public static void main(String[] args) 
	{
		int num=153;
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int last=i%10;
			int fact=1;
			for(int j=last;j>0;j--)
			{
				fact*=j;
			}
			sum+=fact;
		}
		System.out.println(sum==num);
	}
}
