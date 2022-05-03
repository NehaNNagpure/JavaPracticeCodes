import java.util.*;
class program
{
	int iDigit=1;
	public void RDigit(int iNo)
	{
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			System.out.println(iDigit);
			iNo=iNo/10;
		}
		

	}
}
public class ReverseDigit
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
				p.RDigit(no);
			
			}
			
		}
		else
		{
			System.out.println("Invalid numbers");
		}
	}
}