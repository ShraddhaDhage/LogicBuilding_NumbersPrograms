package numbers;

public class PerfectNum 
{
	public static void main(String[] args) 
	{
		int num=6;
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		String res=num==sum?"Perfect Num":"Not perfect num ";
		System.out.println(res);
	}
}
