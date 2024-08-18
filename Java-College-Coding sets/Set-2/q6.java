import java.util.Scanner;

public class q6 {

	public static void SubString(String str, int n)
	{
	for (int i = 0; i < n; i++)
		for (int j = i+1; j <= n; j++)
        {
		System.out.println(str.substring(i, j));
        }
	}

	public static void main(String[] args)
	{   Scanner sc =new Scanner(System.in);
		String str = sc.next();
		SubString(str, str.length());
	}
}

