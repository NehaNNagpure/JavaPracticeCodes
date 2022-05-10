import java.util.*;
class program
{
	public int Linear(int [] a,int iNo)
	{
		int iCnt=0,k=2;
		for(iCnt=0;iCnt<=a.length;iCnt++)
		{
			if(iNo==a[iCnt])
			{
				return iCnt;
			}
		}
		return -1;
	}
}
public class LinearSearch
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
				int iRet=p.Linear(arr,no);
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
