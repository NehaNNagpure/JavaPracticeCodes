import java.util.*;
class program
{
	int i=0;
	public int Display(int [] array)
	{
		for(int iCnt=0;iCnt<array.length;iCnt++)
		{
			if(array[iCnt]>10)
			{
				i++;
			}
		
		}
		return i;
	}
}


public class ArrayGTen
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
				
				program p=new program();
				int iRet=p.Display(mArray);
				System.out.println("sum of even numbers is:"+iRet);
			}
		}
			
		else
		{
			System.out.println("invalid number is not allowed");
		}
		
		
		
	}
}