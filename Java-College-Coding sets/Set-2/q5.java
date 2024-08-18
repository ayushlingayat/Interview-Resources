import java.util.*;
public class q5 {
	static void removeDuplicate(char str[], int n)
	{
		HashSet<Character> s = new LinkedHashSet<>(n - 1);
		for (char x : str)
			s.add(x);
		for (char x : s)
			System.out.print(x);
	}
	public static void main(String[] args)
	{   Scanner sc =new Scanner(System.in);
        String st =sc.next();
		char str[] = st.toCharArray();
		int n = str.length;

		removeDuplicate(str, n);
	}
}
