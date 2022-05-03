import java.util.*;
class program
{
	int iMul=1;
	public void compare(int iNo1,int iNo2,int iNo3)
	{
		if(iNo1<iNo2 && iNo1<iNo3)
		{
			System.out.println("iNo1 is smaller");
		}
		else if(iNo2<iNo1 && iNo2<iNo3)
		{
			System.out.println("iNo2 is smaller");
		}
		else if(iNo1==iNo2 && iNo2==iNo3)
		{
			System.out.println("all three numbers are equal");
		}
		else
		{
			System.out.println("iNo3 is smaller");
		}

		
	}
}
public class Minimum
{
	public static void main(String[] args)
	{
		
		int no1=0,no2=0,no3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		
		if(sc.hasNextInt())
		{
			no1=sc.nextInt();
			Scanner sc1=new Scanner(System.in);
		    System.out.println("enter second number");
			if(sc1.hasNextInt())
			{
				no2=sc1.nextInt();
				Scanner sc2=new Scanner(System.in);
				System.out.println("enter third number");
				if(sc2.hasNextInt())
				{
					no3=sc2.nextInt();
				}
			}
			
			if(no1<0 && no2<0 && no3<0)
			{
				System.out.println("negative numbers not allowed");
			}
			else
			{
				program p=new program();
				p.compare(no1,no2,no3);
			
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}