
public class Deloitte_coding_question_1 
{
	public static void main(String[] args)
	{
		int N= 4;
		
		int A[][]= {
					{454, 55,  521, 14}, 
				    {11,  329, 104, 989},
				    {23447, 174, 87, 845},
				    {25, 81, 53, 111}
				   };
		
		int X= 11;
		
		int result= value(A,N,X);
		
		System.out.println(result);
	}
	
	public static int value(int A[][], int N, int X)
	{
		int S= 0, r=0, c=0, P=0, Z=0;
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(A[i][j]==X)
				{
					S= i+j;
					
					r=i;
					c=j;
					break;
				}
			}			
		}
		
		System.out.println("X is at row= "+r+ " and column= "+c);
		System.out.println("S= "+S);
		
		if(c<N-1)
		{
			Z= A[r][c+1];		
		}
		
		if(c==N-1)
		{
			Z= A[r][0];
		}
		
		int cnt=1;
		
		while(Z!=0)
		{
			int a= Z%10;
					
			P+=(int)Math.pow(a,cnt);
			
			cnt++;
			
			Z/=10;
		}
		
		System.out.println("No of digits= "+(cnt-1));
			
		return P;
	}
}
