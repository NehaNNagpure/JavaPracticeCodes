import java.util.*;

class Factors
{
	public void Display(int num)
	{
		
		for(int i=1;i<=num;i++)
		{
			if((num % i) == 0)
			{
				System.out.println(i);
			}
		}
	}	
}

public class DisplayFactors
{
	public static void main(String[] args)
	{
		int no=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		
		if(sc.hasNextInt())
		{
			no=sc.nextInt();
			if(no<0)
			{
				System.out.println("negative numbers not allowed");
			}
			else
			{
				Factors obj=new Factors();
				obj.Display(no);
			}
			
		}
		else
		{
			System.out.println("invalid numbers");
		}

		
		
	}
}
