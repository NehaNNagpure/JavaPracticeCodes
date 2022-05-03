import java.util.*;
class program
{
	int iDigit=1,iCnt=0;
	public void LSCount(int iNo)
	{
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit<6)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		System.out.println(iCnt);
		

	}
}
public class CountLessSix
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
				p.LSCount(no);
				
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}