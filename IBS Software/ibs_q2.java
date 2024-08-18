
public class ibs_q2 
{
	public static void main(String[] args) 
	{
		String s="I am a good person";
		
		String a[]= s.split(" ");
		
		int k=0;
		int max=a[0].length();
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i].length())
			{
				max=a[i].length();
				k=i;
			}
		}
		
		System.out.println(a[k]+" "+max);
	}

}
