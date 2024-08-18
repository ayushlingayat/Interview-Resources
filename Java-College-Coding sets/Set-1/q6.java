import java.util.Scanner;
/*Write a java program to find sum of digit of a given number until it becomes a single
digit number.
*/
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum=n;
        while(sum>9)
        {   n=sum;
            sum=0;
            while(n!=0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
            }
        }
        System.out.println(sum);
    }
}
