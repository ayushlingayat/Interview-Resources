import java.util.Scanner;
public class gcd_code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos");
        int m =sc.nextInt();
        int n =sc.nextInt();
        System.out.println(gcd(m,n));
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        return gcd(b,a % b);
    }
}
