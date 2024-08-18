import java.util.Scanner;

public class PrimeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c=0;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {   System.out.println(i);
                c++;
            }
        }
        System.out.println(c);
    }
    public static boolean isPrime(int i)
    {
        for(int k=2;k<=i/2;k++)
        {   
            if(i%k==0)
            
            return false;
    
        }
        return true;
    }
}
