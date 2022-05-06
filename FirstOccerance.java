import java.util.*;
class program
{
	public int FOcc(int [] a,int iNo)
	{
		int iCnt=0;
		for(iCnt=0;iCnt<a.length;iCnt++)
		{
			if(a[iCnt]==iNo)
			{
				break;
			}
		}
		if(iCnt==a.length)
		{
			return -1;
		}
		return iCnt;
	}
}
public class FirstOccerance
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of elements");
		if(sc.hasNextInt())
		{
			int iSize=sc.nextInt();
			if(iSize<0)
			{
				System.out.println("negative number not allowed");
			}
			else
			{
				int[] arr=new int[iSize];
				System.out.println("enter the elements of array");
				for(int iCnt=0;iCnt<iSize;iCnt++)
				{
					arr[iCnt]=sc.nextInt();
				}
				System.out.println("enter the number");
				int no=sc.nextInt();
				program p=new program();
				int iRet=p.FOcc(arr,no);
				if(iRet==-1)
				{
					System.out.println("there is no number");
				}
				else
				{
					System.out.println(" number is present"+iRet);
				}

			}
		}
	}
}
