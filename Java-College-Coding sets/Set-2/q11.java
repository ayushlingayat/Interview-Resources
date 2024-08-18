import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m =sc.nextInt();
        int n =sc.nextInt();
        int ar2[][]=new int[m][n];
        int p=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar2[i][j]=arr[p++];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
