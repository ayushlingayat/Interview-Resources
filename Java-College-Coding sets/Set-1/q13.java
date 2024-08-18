import java.util.Scanner;
/*An integer n is divisible by 9 if the sum of its digits is divisible by 9. Develop a
program to display each digit, starting with the rightmost digit. Your program should also 
determine whether or not the number is divisible by 9. Test it on the following numbers: 
*/
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum =0;
        while(n>0)
        {
            int d=n%10;
            System.out.print(d +" ");
            sum=sum+d;
            n=n/10;
        }
        System.out.println();
        if(sum%9==0)
        {
            System.out.println("Divisible by 9");
        }
        else
        {
            System.out.println("Not divisible by 9");
        }
    }
}
