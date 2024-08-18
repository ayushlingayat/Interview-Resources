import java.util.Scanner;

public class cos_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        double sum=0;
        for(int k=0;k<n;k++)
        {
            sum =sum +((Math.pow(-1, k))*(Math.pow(x, 2*k)))/fact(2*k);
        }
        System.out.println(sum);
    }
    public static int fact(int n)
    {   int p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*i;
        }
        return p;
    }
}
