import java.util.*;
class program
{
	public boolean Display(int [] array,int iNo)
	{
		for(int iCnt=0;iCnt<array.length;iCnt++)
		{
			if(array[iCnt]==iNo)
			{
				return true;
			}
		
		}
		return false;
	}
}


public class SearchNumber
{
	public static void main(String[] args)
	{
		boolean iRet=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		if(sc.hasNextInt())
		{
			int iSize=sc.nextInt(); 
			if(iSize<0)
			{
				System.out.println("negative number is not allowed");
				
			}
			else
			{
				
		
				int[] mArray=new int[iSize];
				System.out.println("enter the elements of array");
		
				for(int iCnt=0;iCnt<iSize;iCnt++)
				{
					mArray[iCnt]=sc.nextInt();
				}
				System.out.println("enter a search a number of array");
				int no=sc.nextInt(); 
				program p=new program();
				iRet=p.Display(mArray,no);
				if(iRet==true)
				{
					System.out.println("number is present");
				}
				else
				{
					System.out.println("number is not present");
				}
			}
		}
			
		else
		{
			System.out.println("invalid number is not allowed");
		}
		
		
		
	}
}