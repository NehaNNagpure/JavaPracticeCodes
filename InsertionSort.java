import java.util.*;
class program
{
	public void Sorting(int [] a)
	{
		int i=0,j=0,temp=0;
		for(i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
}

public class InsertionSort
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
				
				program p=new program();
				p.Sorting(arr);
				
				System.out.println("data after sorting");
				for(int iCnt=0;iCnt<iSize;iCnt++)
				{
					System.out.println(arr[iCnt]);
				}
				
				
			}
		}
		else
		{
			System.out.println("number is invalid");
		}
	
	}
	
	
}