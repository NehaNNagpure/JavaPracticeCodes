import java.util.*;
class program
{
	int iSum=0;
	public int perfect(int iNo)
	{
		for(int iCnt=1;iCnt<iNo;iCnt++)  
			
		{
			if(iNo%iCnt==0)
			{
				iSum=iSum+iCnt;
			}
		
		}
		return iSum;
		
	
	}
}

public class CheckPerfectNum
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
				int iRet=p.perfect(no);
				if(iRet==no)
				{
					System.out.println("number is perfect");
				}
				else
				{
					System.out.println("number is not");
				}
				
			}
		}
		else
		{
			System.out.println("invalid number");
		}
	}
}