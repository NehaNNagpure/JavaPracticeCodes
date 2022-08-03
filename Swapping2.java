import java.util.*;
class Swapping
{
	public void swaps(int num1,int num2)
	{
		
		
		System.out.println("two numbers are =" + num1);
		System.out.println("two numbers are =" + num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("two numbers after swapping =" + num1);
		System.out.println("two numbers after swapping =" + num2);
		
		
		
	}
}


public class Swapping2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the two numbers");
		if(sc.hasNextInt())
		{
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			
			if(no1<0 && no2<0)
			{
				System.out.println("negative number is not allowed");
			}
			else
			{
				Swapping s=new Swapping();
				s.swaps(no1,no2);
			}
		}
		else
		{
			System.out.println("invalid output");
		}
		
		
	}
}