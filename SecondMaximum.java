import java.util.*;
class program
{
	public void SecondMax(int [] a)
	{
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			index=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[index]<a[j])
				{
					index=j;
				}
			}
			int temp=0;
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
	}
}
public class SecondMaximum
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
				System.out.println("negative numbers not allowed");
			}
			else
			{
				int [] arr=new int[iSize];
				System.out.println("enter the elements of array");
				for(int iCnt=0;iCnt<iSize;iCnt++)
				{
					arr[iCnt]=sc.nextInt();
				}
				program p=new program();
				p.SecondMax(arr);
				
				System.out.println("After sorting elements");
				for(int iCnt=0;iCnt<iSize;iCnt++)
				{
					System.out.println(arr[iCnt]);
				}
				System.out.println("the second largest elemnts in array is:"+ arr[1]);
				//System.out.println("The second maximum elements of array is:" + iRet);
			}
		}
	}
}