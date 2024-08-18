import java.util.Scanner;

public class fib_prime_series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Nth value");
        int n =sc.nextInt();
        if(n%2==0)
        {
            prime(n/2);
        }
        else fib((n/2+1));
    }
    public static void prime(int n)

    {   int c=0,k=2;
        while(c!=n)
        {   if(isPrime(k))
                c++;
                k++;
        }
        System.out.println(k-1);
    }
    public static boolean isPrime(int k)
    {
        for(int i=2;i<=k/2;i++)
        {
            if(k%i==0)
            {
                return false;
            }

        }
        return true;
    }
    public static void fib(int n)
    {   int a=0,b=1;
        int c=0;
        for(int i=1;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }
}
