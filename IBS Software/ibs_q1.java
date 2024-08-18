
public class ibs_q1 
{
	public static void main(String[] args)
	{
		int y=7;
		
		for(int i=0;i<y;i++)
		{
			for(int j=y-1;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<i+1;k++)
			{
				System.out.print("*");
			}
			
			for(int p=0;p<i;p++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<y-1;i++)
		{
			for(int k=0;k<i+1;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=y-1;j>i;j--)
			{
				System.out.print("*");
			}
			
			for(int p=y-2;p>i;p--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
