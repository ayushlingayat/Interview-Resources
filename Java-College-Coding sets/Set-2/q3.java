import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]=str.split(" ");
        int n=arr.length-1;
        for(int i=n;i>=0;i--)

        {
            System.out.print(arr[i]+" ");
        }
    }
}
