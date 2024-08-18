import java.util.Scanner;

public class rotate_k_left 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		
		System.out.println("Original Array:");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the no. of rotations:");
		int k=sc.nextInt();
		
		int r=gcd(a.length,k);
		
		rotate(a,a.length,k,r);
	}
	
	static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		
		else
		{
			return gcd(b,a%b);
		}		
	}
	
	static void rotate(int a[],int n,int d,int k1)
	{
		for(int i=0;i<k1;i++)
		{
			int temp=a[i];
			int j=i;
			
			while(true)
			{
				int k= j+d;
				
				if(k>=n)
				{
					k= k-n;
				}
				
				if(k==i)
				{
					break;
				}
				
				a[j]=a[k];
				
				j=k;
			}
			
			a[j]=temp;
		}
		
		printArray(a,a.length);
	}
	
	static void printArray(int a[],int n)
	{
		System.out.println("After Rotation:");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
	
}
