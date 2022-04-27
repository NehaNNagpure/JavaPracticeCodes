import java.util.*;
class program
{
	public int SumE(int iNo)
	{
		int iDigit=0,iSum=0;
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iSum=iDigit+iSum;
			}
			iNo=iNo/10;
		}
		return iSum;
	}
}



public class SumEvenDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		if(sc.hasNextInt())
		{
			int no=sc.nextInt();
			if(no<0)
			{
				System.out.println("negative numbers not allowed");
			}
			else
			{
				program p=new program();
				int iRet=p.SumE(no);
				System.out.println(iRet);
			}
		}
		else
		{
			System.out.println("invalid input");
		}
	}
	
}