import java.util.*;
class program
{
	int iMul=1;
	public void DTable(int iNo)
	{
		for(int iCnt=1;iCnt<=10;iCnt++)
		{
			iMul=iNo*iCnt;
			System.out.println(iMul);
		}

		
	}
}
public class DisplayTables
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
				p.DTable(no);
			
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}