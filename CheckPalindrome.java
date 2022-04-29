import java.util.*;
class program
{
	public int Palindrome(int iNo)
	{
		int iDigit=0,iRev=0,iCnt=0;
		while(iNo>0)
		{
			iDigit=iNo%10;
			iRev=iRev*10+iDigit;
			iNo=iNo/10;
		}
		return iRev;
	}
}
public class CheckPalindrome
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
				int iRet=p.Palindrome(no);
				if(iRet==no)
				{
					System.out.println("number is palindrome :"+iRet);
				}
				else
				{
					System.out.println("not a palindrome");
				}
			}
		}
		else
		{
			System.out.println("invalid number");
		}
	}
}