import java.util.Scanner;
/*Write a Java program to print all permutations of a given String. For example, if given
String is "GOD" then your program should print all 6 permutations of this string, e.g.,
"GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."
*/
public class q11 {
	public static void main(String[] args)
	{   Scanner sc =new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		permute(str, 0, n-1);
	}

	public static void permute(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}

