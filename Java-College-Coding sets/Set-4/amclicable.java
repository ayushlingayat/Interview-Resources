import java.util.Scanner;

public class amclicable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a pair of nos");
        int a =sc.nextInt();
        int b= sc.nextInt();
        int a_d=sumoffact(a);
        System.out.println();
        int b_d=sumoffact(b);
        if(a_d==b && b_d==a)
        {
            System.out.println("Amlicable nos");
        }
        else 
        {
            System.out.println("Not Amlicable");
        }
    }
    public static int sumoffact(int n)
    {   int sum=1;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0 && n/i!=i && n/i!=n) 
            {   
                sum=sum+i+n/i;
            }
        }
        return sum;
    }
}
