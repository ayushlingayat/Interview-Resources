import java.util.Scanner;

public class large_fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a=n;
        for(int i=2;i<a/2;i++)
        {   n=n/i;

            if(n==1)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
