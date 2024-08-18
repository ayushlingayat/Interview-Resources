import java.util.Arrays;
import java.util.Scanner;
/*Write a program to find whether it is possible to get a palindrome number from a given
number by re-arranging the positions of its digits. If yes, the program should print 2, else it
must print 1. 
*/
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        String str=Integer.toString(n);
        int count[] = new int[256];
        Arrays.fill(count, 0); // to initialize all values to zero
        for (int i = 0; i < str.length(); i++)
          count[(int)(str.charAt(i))]++;
        int odd = 0;
        for (int i = 0; i < 256; i++)
        {
           if ((count[i] & 1) == 1)
            odd++;
          if (odd > 1)
            System.out.println("1");
        }
        System.out.println("2");
    }
}

