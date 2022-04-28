import java.util.*;
class program
{
	public void SNonFact(int iNo)
	{
		int iCnt=0,iSum=0;
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			if(iNo%iCnt!=0)
			{
				iSum=iSum+iCnt;
			}
			
		}
		System.out.println(iSum);
	}
}
public class SumNonFactors
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numaber");
		if(sc.hasNextInt())
		{
			int no=sc.nextInt();
			if(no<0)
			{
				System.out.println("negative number is not allowed");
			}
			else
			{
				program p=new program();
				p.SNonFact(no);
			}
		}
		else
		{
			System.out.println("Invalid number");
		}
	}
}