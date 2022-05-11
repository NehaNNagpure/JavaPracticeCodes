import java.util.*;
class program
{
	
	public int BinaryS(int [] a,int iNo)
	{
		int low=0;
		int high=a.length-1;
		while(low<=high)
		{
			
			
			int mid=(low+high)/2;
			if(iNo==a[mid])
			{
				return mid;
			}
			else if(iNo>a[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}
}
public class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of elemnts");
		if(sc.hasNextInt())
		{
			int iSize=sc.nextInt();
			if(iSize<0)
			{
				System.out.println("negative number is not allowed");
			}
			else
			{
				
				int [] arr=new int[iSize];
				System.out.println("enter the elements of array");
				for(int i=0;i<iSize;i++)
				{
					arr[i]=sc.nextInt();
				}
				System.out.println("enter the given searching number");
				int no=sc.nextInt();
				program p=new program();
				int iRet=p.BinaryS(arr,no);
				if(iRet==-1)
				{
					System.out.println("number is not found");
				}
				else
				{
					System.out.println("number is found in position of:" +iRet);
				}
				
			}
		}
		else
		{
			System.out.println("number is invalid");
		}
	
	}
}