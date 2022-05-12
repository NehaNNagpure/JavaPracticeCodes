import java.util.*;
class program
{
	public void SelectionSortA(int [] a)
	{
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			index=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[index]>a[j])
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

public class SelectionSortA
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
				p.SelectionSortA(arr);
				
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