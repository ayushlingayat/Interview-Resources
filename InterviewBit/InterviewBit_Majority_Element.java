import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InterviewBit_Majority_Element
{
	public static void main(String[] args)	
	{		
		Scanner sc=new Scanner(System.in);
		
		List<Integer> A=new ArrayList<Integer>();
		
		int n;
		
		for(int i=0;i<7;i++)
		{
			n=sc.nextInt();
			A.add(n);
		}
		
		System.out.println(A);
		
		int res= majorityElement(A);		
		
		System.out.println(res);
	}
	
	public static int majorityElement(final List<Integer> A)
	{
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(int i:A)
		{
			if(!h.containsKey(i))
				h.put(i,1);
			
			else
				h.put(i,h.getOrDefault(i,0)+1);
		}
		
		System.out.println(h);
		
		for(int i:A)
		{
			if(h.get(i)>(A.size()/2))
				return i;
		}
		
		return -1;
	}
}
