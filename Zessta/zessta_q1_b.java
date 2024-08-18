import java.util.Scanner;

public class zessta_q1_b 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		n+=1;
		
		while(pal(n)==0)
		{
			n=n+1;
		}
		
		System.out.println(n);
	}
	
	public static int pal(int n)
	{
		int rev=0,num=n,rem=0;
		
		
		while(n!=0)
		{
			rem=n%10;
			
			rev=(rev*10)+rem;
			
			n/=10;
		}
		
		if(num==rev)
		{
			return 1;
		}
		
		return 0;
	}

}
