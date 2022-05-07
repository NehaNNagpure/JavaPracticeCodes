import java.util.*;
class program
{
	public void reverse(int [] a)
	{
		
		int iCnt=0;
		System.out.println("orignal array is:" );
		for(iCnt=0;iCnt<a.length;iCnt++)
		{
			
			System.out.println(a[iCnt]);
			
		}
		System.out.println("Reverse array is:");
		for(iCnt=a.length-1;iCnt>=0;iCnt--)
		{
			
			System.out.println( a[iCnt]);
			
		}
	
	
	}
}
public class ReverseArray
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
				p.reverse(arr);
				
			}
		}
		else
		{
			System.out.println("Invalid number not allowed");
		}
		
	}
}