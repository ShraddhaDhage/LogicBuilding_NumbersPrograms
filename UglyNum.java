package numbers;

public class UglyNum 
{
	public static void main(String[] args) 
	{
		int num=45;
		while(num>0)
		{
			if(num%2==0)
			{
				num/=2;
			}
			
			else if (num%3==0)
			{
				num/=3;
			}
			
			else if (num%5==0)
			{
				num/=5;
			}
			else
			{
				break;
			}
		}
		
		if(num==1)
		{
			System.out.println("ugly num");
		}
		else
		{
			System.out.println("Not ugly");
		}
	}
	
}
