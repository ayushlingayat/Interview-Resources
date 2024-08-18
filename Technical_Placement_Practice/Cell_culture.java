import java.util.Scanner;

public class Cell_culture 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int cell[]= {1,1,1,0,1,1,1,1};
		
		printArray(cell,cell.length);
		
		System.out.println("Enter the no. of days:");
		int days=sc.nextInt();
		
		cellcompute(cell,cell.length,days);
	}
	
	public static void cellcompute(int cell[], int n, int days)
	{
		while(days>0)
		{
			int temp[]=new int[8];
			
			temp[0]= 0 ^ cell[1];
			temp[n-1]= cell[n-2] ^ 0;
			
			for(int i=1;i<n-1;i++)
			{
				temp[i]= cell[i-1] ^ cell[i+1];
			}
			
			for(int j=0;j<n;j++)
			{
				cell[j] = temp[j];
			}
			
			days--;
		}
		
		printArray(cell,n);		
	}
	
	public static void printArray(int cell[],int n)
	{
		for(int i:cell)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
}
