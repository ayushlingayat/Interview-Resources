import java.util.Scanner;

public class zessta_q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int res= next_pal(n);
		
		System.out.println(res);
	}
	
	public static int next_pal(int n)
	{
		String s="";
		
		boolean ist= true;
		
		if(Integer.toString(n).length()==4)
		{
			for(int i=n+1;i<=n+110;i++)
			{
				s= Integer.toString(i);
				
				char a[]=s.toCharArray();
				
				for(int j=0,k=a.length-1;j<a.length && k>=0;j++,k--)
				{
					if(a[j]!=a[k])
					{
						ist=false;
						break;
					}
				}
				
				if(ist)
				{
					return i;
				}
				
				s="";
				ist=true;
			}
		}
		
		for(int i=n+1;i<=n+11;i++)
		{
			s= Integer.toString(i);
			
			char a[]=s.toCharArray();
			
			for(int j=0,k=a.length-1;j<a.length && k>=0;j++,k--)
			{
				if(a[j]!=a[k])
				{
					ist=false;
					break;
				}
			}
			
			if(ist)
			{
				return i;
			}
			
			s="";
			ist=true;
		}
		
		return 0;
	}

}
