package numbers;

public class PronicNum 
{
	public static int pronic(int num)
	{
		return num*(num+1);
	}
	public static void main(String[] args) 
	{
		int satrt=1;
		int end=10;
		for(int i=0;i<end;i++)
		{
			System.out.println(pronic(i));
		}
		
		
	}
	
}
