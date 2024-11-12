package numbers;

import java.util.Arrays;

import Interface.main;

public class Arr7 
{
	public static void main(String[] args) 
	{
		int[] arr1= {1,3,4,2,6,3,5,6,7};
		//{1,3,4}{3,4,2},{4,2,6},{2,6,3},{6,3,5},{3,5,6},{5,6,7}
		//{4,4,6,6,6,6,7}
		
		int arr2[]=new int[7];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length-1;j++)
			{
				if(arr1[i]>arr1[j] && arr1[i]>arr1[j+1])
				{
					arr2[i]=arr1[i];
				}
				else if(arr1[j]>arr1[i] && arr1[j]>arr1[j+1] )
				{
					arr2[i]=arr1[i];
				}
				else if(arr1[j+1]>arr1[i] && arr1[j+1]>arr1[i]) 
				{
					arr2[i]=arr1[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
