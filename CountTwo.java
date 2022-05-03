import java.util.*;
class program
{
	int iDigit=1,iCnt=0;
	public void TCount(int iNo)
	{
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit==2)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		System.out.println(iCnt);
		

	}
}
public class CountTwo
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
				p.TCount(no);
				
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}