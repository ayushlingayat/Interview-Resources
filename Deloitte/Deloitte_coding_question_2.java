import java.util.HashMap;
import java.util.HashSet;

public class Deloitte_coding_question_2 
{
	public static void main(String[] args) 
	{
		String s="abcdefabcdefabcdefabcdefabcdef";
		
		occur(s);
	}
	
	public static void occur(String s)
	{
		int X=0, Y=1;
		
		char a[]=s.toCharArray();
		
		HashSet<Character> h2= new HashSet<Character>();
		
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		
		for(char c:a)
		{
			if(h1.containsKey(c))
			{
				h1.put(c,h1.get(c)+1);
			}
			
			else
			{
				h1.put(c,1);
			}
			
			h2.add(c);
		}
		
		for(char t:h2)
		{
			if(prime(h1.get(t)))
			{
				X+=h1.get(t);
				Y*=h1.get(t);
			}
		}
				
		System.out.println(h1);
		
		System.out.println(X+" "+Y);
	}
	
	public static boolean prime(int n)
	{
		if(n==1 || n%2==0)
		{
			return false;
		}
		
		if(n==2 || n==3)
		{
			return true;
		}
		
		for(int i=5;i<(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
}
