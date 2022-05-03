import java.util.*;
class program
{
	int iDigit=1,iCnt=0;
	public void ZCount(int iNo)
	{
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit==0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		System.out.println(iCnt);
		

	}
}
public class CountZero
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
				p.ZCount(no);
				
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}