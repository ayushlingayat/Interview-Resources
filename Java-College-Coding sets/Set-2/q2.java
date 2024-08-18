import java.util.Scanner;

public class q2{

	static boolean isPalindrome(String str)
	{
		int i = 0, j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j))
				return false;
			    i++;
			    j--;
		    }
		return true;
	}
	public static void main(String[] args)
	{   Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();

		str = str.toLowerCase();
		if (isPalindrome(str))
			System.out.print("Yes");
		else 
			System.out.print("No");
	}
}

