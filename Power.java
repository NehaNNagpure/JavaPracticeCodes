import java.util.*;
class program
{
	int iMul=1;
	public void DPower(int iNo1,int iNo2)
	{
		for(int iCnt=1;iCnt<=iNo2;iCnt++)
		{
			iMul=iMul*iNo1;
			
		}
		System.out.println("power of a numbers is: "+ iMul);

		
	}
}
public class Power
{
	public static void main(String[] args)
	{
		int no1=0,no2=0;
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
			}
			
			if(no1<0 && no2<0)
			{
				System.out.println("negative numbers not allowed");
			}
			else
			{
				program p=new program();
				p.DPower(no1,no2);
			
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}