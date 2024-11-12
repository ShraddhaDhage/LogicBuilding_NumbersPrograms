package numbers;

public class Coprime 
{
	public static int HCF(int num1,int num2)
	{
		int small=num1<num2?num1:num2;
		
		for(;small>0;small--)
		{
			if(num1%small==0 && num2%small==0)
			{
				break;
			}
			
		}
		return small;
	}
	
	public static boolean isCoPrime(int num1,int num2)
	{
		if(HCF(num1, num2)==1)
		{
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(isCoPrime(9, 12));
	}
}
