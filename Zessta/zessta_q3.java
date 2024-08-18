import java.util.Scanner;

public class zessta_q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String s="sky1234story456state789smile";
		
		int res= sum(s);
		
		System.out.println(res);
	}
	
	public static int sum(String s)
	{
		char t[]=s.toCharArray();
		
		int i=0,j=0,k=0,sum=0;
		
		for(i=0;i<t.length;i++)
		{
			if(Character.isDigit(t[i]))
			{
				j=i;
				
				for(int p=j;p<t.length;p++)
				{
					if(Character.isAlphabetic(t[p]))
					{
						k=p;
						break;
					}					
				}
				
				for(int q=(k-j-1),m=j,z=0;q>=0 && m<k && z<(k-j);q--,m++,z++)
				{
					sum += (t[m]-48)*((int)Math.pow(10,q));
				}	
				
				i=k;
			}
		}
		
		return sum;
	}

}
