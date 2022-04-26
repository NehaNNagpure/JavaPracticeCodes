import java.util.*;
class program
{
	public int AddDigit(int iNo)
	{
		int iSum=0,iDigit=0;
		while(iNo>0)
		{
			iDigit=iNo%10;
			iSum=iSum+iDigit;
			iNo=iNo/10;
		}
		return iSum;
	}
}


public class AdditionDigit
{
	public static void main(String args[])
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
				int iRet=p.AddDigit(no);
				System.out.println("Addition of digit is: "+iRet);
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}
