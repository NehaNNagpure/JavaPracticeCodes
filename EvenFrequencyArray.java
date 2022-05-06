import java.util.*;

class program
{
	public int EvenFre(int [] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
}
public class EvenFrequencyArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
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
				program p=new program();
				int iRet=p.EvenFre(arr);
				System.out.println("frequency of even number:"+iRet);
			}
		}
		else
		{
			System.out.println("Invalid number not allowed");
		}
		
	}
}
