
public class right_rotate 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		
		System.out.println("Original Array:");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		rotate(a,a.length);
	}
	
	static void rotate(int a[],int n)
	{
		int temp,i;
		
		temp= a[n-1];
		
		for(i=n-1;i>0;i--)
		{
			a[i]=a[i-1];
//			a[i]=i;
		}
		
		a[i]=temp;
		
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
