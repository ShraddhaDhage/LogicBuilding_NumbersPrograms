package numbers;

public class Automor 
{
	public static void main(String[] args) 
	{
		int num=5;
		int sq=num*num;
		
		int ct=0;
		for(int i=num;i>0;i/=10)
		{
			ct++;
		}
		
		int pow=1;
		for(int i= 0;i<ct;i++)
		{
			pow*=10;
		}
		
		int divideBy=pow;
		if(sq%(divideBy)==num)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not automorphic");
		}
		
		
		
	}
}
