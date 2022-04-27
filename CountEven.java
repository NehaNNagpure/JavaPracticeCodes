import java.util.*;
class program
{
	public int countE(int iNo)
	{
		int iDigit=0,iCnt=0;
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}



public class CountEven
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
				int iRet=p.countE(no);
				System.out.println(iRet);
			}
		}
		else
		{
			System.out.println("invalid input");
		}
	}
	
}