import java.util.*;
class program
{
	int iMul=1;
	public void pattern(int iNo)
	{
		for(int iCnt=1;iCnt<=iNo;iCnt++)
		{
			System.out.print(iCnt + "\t * \t");
		}

		
	}
}
public class pattern2
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
				p.pattern(no);
			
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}