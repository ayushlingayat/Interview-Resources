import java.util.Scanner;
/*Write a java program to find minimum and maximum occurring character of a given
string. */
public class q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        char max_c =str.charAt(0);
        char min_c=str.charAt(0);
        int min=str.length();
        int max=0;
        for(int i=0;i<str.length()-1;i++)
        {   int c=0;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j) && (str.charAt(i)!=' '))
                {
                    c++;
                }
            }
            if(c>max)
                {
                    max=c;
                    max_c=str.charAt(i);
                }
                if(c<min)
                {
                    min=c;
                    min_c=str.charAt(i);
                }
        }
        System.out.println("Max character "+max_c);
        System.out.println("Min character "+min_c);
    }
}
