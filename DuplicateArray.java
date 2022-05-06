import java.util.*;
class program
{
	int iSum=0;
	public int Min(int [] array)
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
			}
		
		}
		return count;
	}
}


public class DuplicateArray
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
				int iRet=p.Min(mArray);
				System.out.println("Duplicate number of array:"+iRet);
			}
		}
			
		else
		{
			System.out.println("invalid number is not allowed");
		}
		
		
		
	}
}