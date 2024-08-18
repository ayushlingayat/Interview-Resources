import java.util.Scanner;

public class lcd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st fraction");
        String fra1 =sc.next();
        String []fra = fra1.split("/");
        int a=Integer.parseInt(fra[0]);
        int b=Integer.parseInt(fra[1]);

        System.out.println();
        System.out.println("Enter 2nd fraction");
        String fra2 =sc.next();
        String []fr = fra2.split("/");
        int c=Integer.parseInt(fr[0]);
        int d=Integer.parseInt(fr[1]);
        System.out.println();

        int hcf=gcd(b,d);
        int lcm=(b*d)/hcf;
        a=a*(lcm/b);
        c=c*(lcm/d);
        int sum=a+c;
        System.out.println(sum+"/"+lcm);
    }
    public static int gcd(int b, int d)
    {
        if(d==0)
        {
            return b;
        }
        else return gcd(d,b%d);
    }
}
