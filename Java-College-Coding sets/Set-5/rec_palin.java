import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class rec_palin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        int l=str.length();
        int k = palin(str,0,l-1);
        if(k<0)
        {
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindrome");
        }
    }
    public static int palin(String str,int s,int e)
    {   int c=0;
        if(s>e)
        {
            return c;
        }
        else if(str.charAt(s)==str.charAt(e))
        {   c++;
            return palin(str,++s,--e);
        }
        else 
        return -1;
    }
}
