package numbers;

public class DisariumNum 
{
	public static int count(int num)
	{
		int ct=0;
		for(int i=num;i>0;i/=10)
		{
			ct++;
		}
		return ct;
	}
	
	public static void main(String[] args) 
	{
		int num=135;
		int ct=count(num);
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int last=i%10;
			
			int pow=1;
			for(int j=0;j<ct;j++)
			{
				pow*=last;
			}
			sum+=pow;
			ct--;
			
		}
		
		if(num==sum)
		{
			System.out.println("Disarium num");
			
		}
		else
		{
			System.out.println("Not disarium num");
		}
		
		
		
	}
}
