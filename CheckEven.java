import java.util.*;
class program
{
	public void ShowEvenOdd()
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number\n");
			while(true)
			{
				if(sc.hasNextInt())
				{
					
					int no=sc.nextInt();
					if(no>0)
					{
						
						if(no%2==0)
						{
							System.out.println("even");
						}
						else
						{
							System.out.println("odd");
						}
					}
					else
					{
						System.out.println("negative number not allowed");
					}
				}
				else
				{
					System.out.println("number not found");
					break;
				}
			}
		    
	
	}
}
public class CheckEven
{
	public static void main(String[] args)
	{
		program obj=new program();
		obj.ShowEvenOdd();
	}
	
}