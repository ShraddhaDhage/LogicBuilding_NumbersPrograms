package numbers;

public class ArmstrongNum {
	public static void main(String[] args) 
	{
		int num=135;
		int countOfDigits=0;
		for(int i=num;i>0;i/=10)
		{
			countOfDigits++;
		}
		
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int last=i%10;
			
			int pow=1;
			for(int j=0;j<countOfDigits;j++)
			{
				pow*=last;
			}
			
			sum+=pow;
		}
		System.out.println(sum==num);
	}
}
