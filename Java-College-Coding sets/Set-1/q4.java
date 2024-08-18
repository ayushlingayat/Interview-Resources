import java.util.Scanner;
/*Write a java program to check whether two given number ‘a’ and ‘b’ are consecutive
term in the Fibonacci series or not. 
*/
public class q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a>1)
        {
           int c=b-a;
            b=c;
            a=a-b;
        }
        if(a==1)
        {
            System.out.println("finonacci");
        }
        else{
            System.out.println("not fib");
        }
    }
}
