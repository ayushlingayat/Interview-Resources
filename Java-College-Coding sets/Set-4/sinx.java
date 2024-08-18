import java.util.Scanner;

public class sinx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =sc.nextInt();
        double sinx=0;
        for(int i=0;i<=n;i++)
        {
            sinx=sinx+(Math.pow(-1,n)*Math.pow(x, 2*n+1))/fact(2*n+1);
        }
        System.out.println(sinx);
    }
    public static int fact(int k)
    {   int p=1;
        for(int i=1;i<=k;i++)
        {
            p=p*i;
        }
        return p;
    }
}
