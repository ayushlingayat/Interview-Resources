import java.util.Scanner;

public class zessta_q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		boolean is=true;
		
		for(int i=n;i<=m;i++)
		{
			if(i%3==0)
			{
				if(i%5==0)
				{
					System.out.println("FizzBuzz ");	
					is=false;
				}	
				
				if(is==true)
				{
					System.out.println("Buzz ");
				}
			}
			
			else if(i%5==0)
			{
				System.out.println("Fizz ");
			}
			
			else
			{
				System.out.println(i+" ");
			}
			
			is=true;
		}
	}

}
