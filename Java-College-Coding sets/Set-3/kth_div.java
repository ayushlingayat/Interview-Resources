import java.util.Scanner;

public class kth_div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0,i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
                if(c==k)
                {
                    break;
                }
            }
        }
        System.out.println(i);
    }
}
