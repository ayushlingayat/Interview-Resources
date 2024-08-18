import java.util.Scanner;

public class smallest_fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div  =2;
        System.out.println("Enter integer value");
        int n=sc.nextInt();
        while(n>1)
        {
            if(n%div==0)
            {
                System.out.print(div+" ");
                n=n/div;
            }
            else 
            {
                div++;
            }
        }
    }
}
